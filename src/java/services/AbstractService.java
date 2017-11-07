package services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response; 
import utils.AnnotationExclusionStrategy;

@Consumes({MediaType.TEXT_XML, MediaType.APPLICATION_XML,
    MediaType.APPLICATION_JSON})
@Produces({MediaType.TEXT_XML, MediaType.APPLICATION_XML,
    MediaType.APPLICATION_JSON})
public abstract class AbstractService {

    @Context
    private HttpServletRequest request;

    protected final Gson gson;

    public AbstractService() {
        gson = new GsonBuilder().setExclusionStrategies(new AnnotationExclusionStrategy()).create();
    }

    public HttpSession getSession() {
        return request.getSession();
    }

    public void validateSession() {
        if (getSession().getAttribute("username") == null) {
            throw new WebApplicationException(Response.Status.UNAUTHORIZED);

        }
    }

}
