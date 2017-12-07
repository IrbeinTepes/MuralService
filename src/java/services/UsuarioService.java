/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;
import dao.UsuarioDao;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import model.MuralappUsuario;

@Path("usuarioservice/")
public class UsuarioService extends AbstractJpaService<UsuarioDao> {

    @POST
    @Path("/login")
    public String validaLogin(String entity) {
        return gson.toJson(UsuarioDao.login(gson.fromJson(entity, dao.getEntityClass())));
    }
    
}