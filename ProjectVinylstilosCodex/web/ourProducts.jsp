<%-- 
    Document   : ourProducts
    Created on : 25/06/2021, 0:04:06
    Author     : codex
--%>



<%@page import="java.util.List"%>
<%@page import="com.google.gson.JsonElement"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="ec.edu.espe.vinylstilos.client.ProductRestClient"%>
<%@page import="ec.edu.espe.vinylstilos.model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Estos son nuestros productos:</h1>
        
        <%
            ProductRestClient cli = new ProductRestClient();
            List<Product> products = cli.getJson(List.class );
            
            Gson gson = new Gson();
            JsonElement jsonElement;
            Product prod;
            
        %>
        
        <table width="600" borde="1">
                <tr>
                    <th width="91"> <div align="center"> ID </div> </th>
                    <th width="98"> <div align="center">Name </div> </th>
                    <th width="91"> <div align="center">Description </div> </th>
                    <th width="91"> <div align="center">Image </div> </th>
                    <th width="100"> <div align="center">Price </div> </th>
                    <th width="91"> <div align="center">Among </div> </th>
                    <th width="91"> <div align="center">Category</div> </th>
                </tr>
                <% for (int i=0; i<products.size(); i++){ %>
                <tr>
                    <% 
                        jsonElement = gson.toJsonTree(products.get(i));
                        prod = gson.fromJson(jsonElement, Product.class); 
                    %>
                    <td><div align="center"><%=prod.getIdProduct()%></div></td>
                    <td><div align="center"><%=prod.getNameProduct()%></div></td>
                    <td><div align="center"><%=prod.getDescriptionProduct()%></div></td>
                    <td><div align="center"><%=prod.getImageProduct()%></div></td>
                    <td><div align="center"><%=prod.getPriceProduct()%></div></td>
                    <td><div align="center"><%=prod.getAmountProduct()%></div></td>
                    <td><div align="center"><%=prod.getCategoryProduct()%></div></td>
                </tr>
                <% } %>
            </table>
        
        
        
    </body>
</html>
