/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vinylstilos.client;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:SaleRest [sale]<br>
 * USAGE:
 * <pre>
 *        SaleClient client = new SaleClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author codex
 */
public class SaleClient {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/ProjectVinylstilosCodex/webresources";

    public SaleClient() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("sale");
    }

    public <T> T getSaleByIdUser(Class<T> responseType, String getByIdSale) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}", new Object[]{getByIdSale}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    /*
    public void deleteByIdSale(Object requestEntity, String deleteByIdSale) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("{0}", new Object[]{deleteByIdSale})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).delete(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }*/

    public <T> T postSale(Object requestEntity, Class<T> responseType, String postSale) throws ClientErrorException {
        return webTarget.path(java.text.MessageFormat.format("{0}", new Object[]{postSale})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON), responseType);
    }

    public String getXml() throws ClientErrorException {
        WebTarget resource = webTarget;
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(String.class);
    }

    public void putSale(Object requestEntity, String putSale) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("{0}", new Object[]{putSale})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void putXml(Object requestEntity) throws ClientErrorException {
        webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_XML).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_XML));
    }

    public void close() {
        client.close();
    }
    
}
