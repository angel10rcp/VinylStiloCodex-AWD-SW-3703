/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vinylstilos.webservices;

import ec.edu.espe.vinylstilos.controller.SaleController;
import ec.edu.espe.vinylstilos.model.Sale;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Lenovo
 */
@Path("sale")
public class SaleRest {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of SaleRest
     */
    public SaleRest() {
    }
    @POST
    @Path("{postSale}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Sale postSale(Sale sale) {
        SaleController newSale = new SaleController();
        return newSale.postSale(sale);
    }
    /**
     * Retrieves representation of an instance of ec.edu.espe.vinylstilos.webservices.SaleRest
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of SaleRest
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
