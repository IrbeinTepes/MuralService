/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.Query;
import model.InscitIndividuos;
import persistence.JpaUtil;

/**
 *
 * @author IrbeinTepes
 */
public class PesquisaDao {
    
     public static List<InscitIndividuos> pesquisa(int[] characteristics) {
        String queryString = "select i from model.InscitIndividuos i";
        if(characteristics[0] !=1 || characteristics[1] != 1 || characteristics[2] !=1){
        queryString = queryString.concat(" WHERE");
        if(characteristics[0] !=  1){
            queryString = queryString.concat(" i.indcorId.id ="+characteristics[0]+"");
        }
        if(characteristics[1] !=  1){
            if(characteristics[0] != 1){
            queryString = queryString.concat(" and");    
            }
            queryString = queryString.concat(" i.indcabeloId.id ="+characteristics[1]+"");
        }
        if(characteristics[2] !=  1){ 
            if(characteristics[0] != 1 || characteristics[1] != 1){
            queryString = queryString.concat(" and");    
            }
            queryString = queryString.concat(" i.indolhosId.id ="+characteristics[2]+"");
        }
        }
        Query query =  JpaUtil.getEntityManager().createQuery(queryString);
        return query.getResultList();
     }   
} 
