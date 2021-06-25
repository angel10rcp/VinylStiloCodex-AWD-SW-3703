<%-- 
    Document   : ConsumeGetSale
    Created on : 24-jun-2021, 23:34:07
    Author     : Lenovo
--%>

<%@page import="ec.edu.espe.vinylstilos.webservices.SaleRest"%>
<%@page import="ec.edu.espe.vinylstilos.model.Sale"%>
<%@page import="ec.edu.espe.vinylstilos.controller.SaleController"%>
<%@page import="ec.edu.espe.vinylstilos.model.Sale"%>
<%@page import="ec.edu.espe.vinylstilos.client.SaleClient"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>Sales</title>
        
    </head>
    <body>
        <h1>Your Sale</h1>
        <%
            Sale sale = new Sale();
            SaleClient saleClient = new SaleClient();
            //out.print(sale.getDate());
         %>
        <script src="ValidationIdSale.js">
            if(validateIdSale(document.getElementById('idSale'))){
                <% sale = saleClient.getSaleByIdUser(sale.getClass(),request.getParameter("idSale"));%>
            }else{
                <%
                    out.print("Your Sale is wrong");
                    sale = null;
                %>
            }
            
        </script>
        <div class="container">
                <table>
                        <thead>
                                <tr>
                                        <th>Id Sale</th>
                                        <th>Id User</th>
                                        <th>Total Sale</th>
                                        <th>Date Sale</th>
                                </tr>
                        </thead>
                        <tbody>
                                <tr>
                                        <td><% out.print(sale.getIdSale()); %></td>
                                        <td><% out.print(sale.getIdUser()); %></td>
                                        <td><% out.print(sale.getTotalSale()); %></td>
                                        <td><% out.print(sale.getDate()); %></td>
                                </tr>
                        </tbody>
                </table>
        </div>
    </body>
</html>