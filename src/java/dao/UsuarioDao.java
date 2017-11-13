/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.Query;
import model.MuralappUsuario;
import persistence.JpaUtil;

/**
 *
 * @author IrbeinTepes
 */
public class UsuarioDao extends JpaDaoBase<MuralappUsuario>{
    
        public static MuralappUsuario login(MuralappUsuario user) {
        Query query = JpaUtil.getEntityManager().createQuery("select u from model.MuralappUsuario u where u.usrLogin= :login and u.usrSenha= :senha ")
                .setParameter("login", user.getUsrLogin())
                .setParameter("senha", user.getUsrSenha());
        return (MuralappUsuario)query.getResultList().get(0);
    }
        
}
