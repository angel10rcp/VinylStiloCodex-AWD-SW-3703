<%-- 
    Document   : register
    Created on : jun 24, 2021, 7:24:12 p.m.
    Author     : Kevin Caicedo
--%>

<%@page import="ec.edu.espe.vinylstilos.webservices.UserRest"%>
<%@page import="ec.edu.espe.vinylstilos.model.User"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="style.css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

    </head>
    <body>		
        <h1>Usuarios del sistema</h1><a href="index.jsp">Return</a>
        <%
            if((String)request.getParameter("email")!=null){
            User userReq = new User();
            userReq.setEmail((String) request.getParameter("email"));
            userReq.setIdUser((String) request.getParameter("iduser"));
            userReq.setLastName((String) request.getParameter("lastname"));
            userReq.setPassword((String) request.getParameter("password"));
            userReq.setFirstName((String) request.getParameter("firstname"));

            UserRest userR = new UserRest();
            userR.create(userReq);}
        %>



        <div class="container">
            <div class="row">
                <div class="col">
                    <table class="table">
                        <thead>
                            <tr>
                                <th>IDUSER</th>
                                <th>FIRSTNAME</th>
                                <th>LASTNAME</th>
                                <th>EMAIL</th>
                                <th>PASSWORD</th>                                  
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                UserRest userRes = new UserRest();

                                for (User user : userRes.getJson()) {
                            %>                               
                            <tr>
                                <td><%=user.getIdUser()%></td>
                                <td><%=user.getFirstName()%></td>
                                <td><%=user.getLastName()%></td>
                                <td><%=user.getEmail()%></td>
                                <td><%=user.getPassword()%></td>                                    
                            </tr>
                            <%}%>
                        </tbody>
                    </table>
                </div>
            </div>      
        </div>
    </body>
</html>