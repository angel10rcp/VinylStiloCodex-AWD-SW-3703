/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vinylstilos.webservices;

import ec.edu.espe.vinylstilos.controller.UserController;
import ec.edu.espe.vinylstilos.model.User;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Kevin Caicedo
 */
@Path("UserServices")
public class UserRest {

    @Context
    private UriInfo context;
    private UserController userController = new UserController();

    /**
     * Creates a new instance of UserRest
     */
    public UserRest() {
    }

    /**
     * Retrieves representation of an instance of restVinilo.UserResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getJson() {
        return userController.ShowUsers();
    }

    /**
     * PUT method for updating or creating an instance of UserResource
     *
     * @param content representation for the resource
     */
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public void create(User user) {
        userController.insertUser(user);
    }

    @PUT
    @Path("{idUser}")
    @Consumes({MediaType.APPLICATION_JSON})
    public void edit(@PathParam("idUser") String id, User entity) {
        userController.putUser(id, entity);
    }

    @DELETE
    @Path("{idUser}")
    public void remove(@PathParam("idUser") String id) {
        userController.deleteUser(id);
    }

    @GET
    @Path("{idUser}")
    @Produces({MediaType.APPLICATION_JSON})
    public User find(@PathParam("idUser") String id) {
        return userController.getUserById(id);
    }

}
