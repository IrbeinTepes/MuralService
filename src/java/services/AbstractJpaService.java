package services;

import dao.JpaDaoBase;
import java.lang.reflect.ParameterizedType;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

public abstract class AbstractJpaService<T extends JpaDaoBase> extends AbstractService implements Service<T> {

    private static final int PAGE_SIZE = 10;

    protected T dao;

    public AbstractJpaService() {
        super();
        try {
            dao = ((Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]).newInstance();
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(AbstractJpaService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @GET
    @Override
    public String findAll() {
        return gson.toJson(dao.findAll());
    }

    @POST
    @Override
    public void save(String entity) {
        dao.save(gson.fromJson(entity, dao.getEntityClass()));
    }

    @GET
    @Path("{id}")
    @Override
    public String findById(@PathParam("id") Integer id) {
        return gson.toJson(dao.findById(id));
    }

    @DELETE
    @Path("{id}")
    @Override
    public void remove(@PathParam("id") Integer id) {
        dao.remove(id);
    }

//    @GET
//    @Override
//    public String findAllBetween(@QueryParam("page") int page) {
//        return gson.toJson(dao.findAllBetween(page * PAGE_SIZE, PAGE_SIZE));
//    }
}
