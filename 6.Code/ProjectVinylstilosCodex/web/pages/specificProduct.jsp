<%-- 
    Document   : specificProduct
    Created on : 25/06/2021, 2:48:09
    Author     : codex
--%>

<%@page import="ec.edu.espe.vinylstilos.model.Product"%>
<%@page import="ec.edu.espe.vinylstilos.client.ProductNameClient"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>research for product</title>
        <link rel="stylesheet" href="../style.css">
    </head>
    <body>
        <h1>La informacion:</h1>
        
        <%
            ProductNameClient cli = new ProductNameClient();
<<<<<<< HEAD:ProjectVinylstilosCodex/web/ourProducts.jsp
            ArrayList<Product> products = cli.getData(ArrayList.class );
            
            Gson gson = new Gson();
            JsonElement jsonElement;
            Product prod;
=======
            Product prod = cli.getProductByName(Product.class, request.getParameter("name") );
>>>>>>> c2072fce8a72cb22d0515864de13ba05e7dd63c8:6.Code/ProjectVinylstilosCodex/web/pages/specificProduct.jsp
            
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
                <% if (prod != null){ %>
                <tr>
<<<<<<< HEAD:ProjectVinylstilosCodex/web/ourProducts.jsp
                    <% 
                        jsonElement = gson.toJsonTree(products.get(i));
                        prod = gson.fromJson(jsonElement, Product.class);
                        
                    %>
=======
>>>>>>> c2072fce8a72cb22d0515864de13ba05e7dd63c8:6.Code/ProjectVinylstilosCodex/web/pages/specificProduct.jsp
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