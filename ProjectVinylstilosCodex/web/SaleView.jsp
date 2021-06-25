<%-- 
    Document   : SaleView
    Created on : 24-jun-2021, 23:15:32
    Author     : Lenovo
--%>

<%@page import="ec.edu.espe.vinylstilos.model.Sale"%>
<%@page import="ec.edu.espe.vinylstilos.client.SaleClient"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="style.css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Sale View</title>
    </head>
    <body>
        <h1>Search a Sale</h1>
        
        <form action="SaleView.jsp" method="POST">
            <div class="form-row align-items-center">
              <div class="col-sm-3 my-1">
                <input type="text" class="form-control" name="idSale" id="inlineFormInputName" placeholder="Example: 027S"/>
              </div>
              
              <div class="col-auto my-1">
                <button type="submit" class="btn btn-primary">Submit</button>
              </div>
            </div>
        </form>
        <div class="container">
            <div class="row">
                <div class="col">
                    <table class="table">
                        <thead>
                            <tr>
                                <th>ID VENTA</th>
                                <th>ID USER</th>
                                <th>TOTAL SALE</th>
                                <th>DATE</th>                                  
                            </tr>
                        </thead>
        
        <%
            Sale sale = new Sale();
            SaleClient saleClient = new SaleClient();
            if ((String) request.getParameter("idsale") != ""){
                sale = saleClient.getSaleByIdUser(sale.getClass(), request.getParameter("idSale"));
                
            
            
        %>
        
        
                        <tbody>
                                                         
                            <tr>
                                <td><%=sale.getIdSale()%></td>
                                <td><%=sale.getIdUser()%></td>
                                <td><%=sale.getTotalSale()%></td>
                                <td><%=sale.getDate()%></td>
                                                                    
                            </tr>
                            
                        </tbody>
                    <% } %>
                    </table>
                </div>
            </div>      
        </div>
       
    </body>
</html>