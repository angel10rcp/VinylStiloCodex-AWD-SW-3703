/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vinylstilos.DataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Angel Cardenas
 */
public class DataBaseConnection {
    private Connection connect;
    private Statement sqlStatement;
    
      public  DataBaseConnection() {
        connect = null;
        sqlStatement = null;
    }
      
        public Statement getSqlStatement() {
        return sqlStatement;
    }
        
      public void connect() {
        try {           
            //---------------------------------------------------------------------------------------------------
            //Connection By Angel Cardenas
           //Class.forName("org.mariadb.jdbc.Driver");
             //   connect = DriverManager.getConnection("jdbc:mariadb://localhost:3307/vinylstilos"
               //        + "?user=root&password=12345678");
            //---------------------------------------------------------------------------------------------------
            //---------------------------------------------------------------------------------------------------
            //Connection By Abigail Cabascango
            //Class.forName("org.mariadb.jdbc.Driver");
            //connect = DriverManager.getConnection("jdbc:mariadb://localhost:3306/vinylstilos"
            //           + "?user=root&password=mypass");
            //---------------------------------------------------------------------------------------------------
             //Connection By KevinCaicedo
           Class.forName("org.mariadb.jdbc.Driver");
                connect = DriverManager.getConnection("jdbc:mariadb://localhost:3360/vinylstilos"
                       + "?user=root&password=admin");
                
            sqlStatement = connect.createStatement();
            System.out.println("conexion normal");
        } catch (Exception e) {
            System.out.println("e.getMessage()");
            System.out.println("stack in the catch --> " + e.toString());
            e.printStackTrace();
        }
    }
    public void disconnect() {
        try {
            if (sqlStatement != null) {
                sqlStatement.close();
                connect.close();
                System.out.println("desconexion normal");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }   
}
