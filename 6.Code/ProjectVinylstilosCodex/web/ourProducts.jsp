<%-- 
    Document   : ourProducts
    Created on : 25/06/2021, 0:04:06
    Author     : codex
--%>



<%@page import="java.util.List"%>
<%@page import="ec.edu.espe.vinylstilos.webservices.ProductRest"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ec.edu.espe.vinylstilos.client.ProductNameClient"%>
<%@page import="com.google.gson.JsonElement"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="ec.edu.espe.vinylstilos.model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Products</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <h1>These are our products</h1>
        
        <%
           ProductRest productRest = new ProductRest();
           List<Product> products = productRest.getJson();
           Product product = new Product();
           
        %>
        
        <table width="600" borde="1">
                <tr>
                    <th width="91"> <div align="center"> ID </div> </th>
                    <th width="98"> <div align="center">Name </div> </th>
                    <th width="91"> <div align="center">Description </div> </th>
                    <th width="91"> <div align="center">Image </div> </th>
                    <th width="100"> <div align="center">Price </div> </th>
                    <th width="91"> <div align="center">Amount </div> </th>
                    <th width="91"> <div align="center">Category</div> </th>
                </tr>
                <% for (int i=0; i<products.size(); i++){ %>
                <tr>
                    <% 
                        product = products.get(i); 
                    %>
                    <td><div align="center"><%=product.getIdProduct()%></div></td>
                    <td><div align="center"><%=product.getNameProduct()%></div></td>
                    <td><div align="center"><%=product.getDescriptionProduct()%></div></td>
                    <td><div align="center"><%=product.getImageProduct()%></div></td>
                    <td><div align="center"><%=product.getPriceProduct()%></div></td>
                    <td><div align="center"><%=product.getAmountProduct()%></div></td>
                    <td><div align="center"><%=product.getCategoryProduct()%></div></td>
                </tr>
                <% } %>
            </table>
        
        
        
    </body>
</html>