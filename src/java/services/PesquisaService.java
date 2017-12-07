/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.JpaDaoBase;
import dao.PesquisaDao;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import model.InscitIndividuos;
import persistence.JpaUtil;

/**
 *
 * @author IrbeinTepes
 */
@Path("/pesquisa")
public class PesquisaService extends AbstractJpaService<JpaDaoBase> {

    @POST
    @Path("/characteristics")
    public String pesquisa(String listaCaracteristicas) {
        return gson.toJson(PesquisaDao.pesquisa( gson.fromJson(listaCaracteristicas, int[].class)));
    }

}
