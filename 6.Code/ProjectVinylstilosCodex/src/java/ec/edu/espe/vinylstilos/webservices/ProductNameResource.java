/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vinylstilos.webservices;

import ec.edu.espe.vinylstilos.controller.ProductController2;
import ec.edu.espe.vinylstilos.model.Product;
import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author pabli
 */
@Path("productName")
public class ProductNameResource {

    private ProductController2 controller = new ProductController2();
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ProductNameResource
     */
    public ProductNameResource() {
    }

    /**
     * Retrieves representation of an instance of ec.edu.espe.vinylstilos.webservices.ProductNameResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Product getProductByName(@PathParam("name") String name ) {
        return controller.getDataByName(name);
    }
    
    @GET
    @Path("/data")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Product> getData( ) {
        return controller.getData();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void postProduct(Product prod ) {
        controller.postProduct(prod);
    }
    /**
     * PUT method for updating or creating an instance of ProductNameResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
