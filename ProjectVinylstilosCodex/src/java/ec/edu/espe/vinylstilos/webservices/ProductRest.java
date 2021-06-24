/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vinylstilos.webservices;

import ec.edu.espe.vinylstilos.controller.ProductController;
import ec.edu.espe.vinylstilos.model.Product;
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
 * @author Angel Cardenas
 */
@Path("products")
public class ProductRest {
 
    private ProductController controller = new ProductController();        
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ProductRest
     */
    public ProductRest() {
    }
    
    /**
     * Retrieves representation of an instance of ec.edu.espe.vinylstilos.webservices.ProductRest
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> getJson() {
        ProductController productController = new ProductController();
        return productController.readProduct();
    }
    
 
    
    @GET
    @Path("/{idProduct}")
    @Produces(MediaType.APPLICATION_JSON)
    public Product getProductById(@PathParam("idProduct")String idProduct) {
    ProductController productController = new ProductController();
        Product product = new Product();
        for(Product aux: productController.readProduct()){
            if(aux.getIdProduct() == null ? idProduct == null : aux.getIdProduct().equals(idProduct)){
                product = aux;
            }
        }
        return product;
    }    
    
    @POST
    @Path("/createProducts")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void postProduct(Product prod ) {
        controller.postProduct(prod);
    }
    
    @PUT
    @Path("/updateProduct/{idProduct}")
    @Consumes(MediaType.APPLICATION_JSON)
    public String updateProduct(@PathParam("idProduct")String idProduct,Product product) {
        ProductController productController = new ProductController();
        if(productController.updateProduct(idProduct, product)){
            return "Product Update";
        }else{
            return "Product isn't update";
        }
    }
    
    @DELETE
    @Path("deleteProducts/{idProduct}")
    @Consumes(MediaType.APPLICATION_JSON)
    public String deleteProduct(@PathParam("idProduct") String idProduct){
        ProductController productController = new ProductController();
        if (productController.deleteProductByID(idProduct))
            return "Product remove";
        else
            return "Porduct isn't remove";
    }
    
    /**
     * PUT method for updating or creating an instance of ProductRest
     * @param content representation for the resource
    * */
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }  
}
