/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;
import dao.MuralappUsuarioDao;
import javax.ws.rs.Path;

@Path("/usuarioservice")
public class UsuarioService extends AbstractJpaService<MuralappUsuarioDao> {

}