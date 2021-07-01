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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author codex
 */
public class DataBaseConnection {
    private Connection connect;
    private Statement sqlStatement;
    public  DataBaseConnection(){
        connect = null;
        sqlStatement = null;
    }
      
        public Statement getSqlStatement() {
        return sqlStatement;
    }
        
      public void connect() {         
           String path = "C:\\Users\\Kevin Caicedo\\Documents\\5to semestre\\Web Avanzado\\Proyecto Repositorio Grupo 3\\config.json";
             try {
            Class.forName("org.mariadb.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mariadb://" + Config.readConfig(path, "HOST") + ":" 
                    + Config.readConfig(path, "PORT") + "/" 
                    + Config.readConfig(path, "NAME")
                    + "?user=" + Config.readConfig(path, "USER")
                    + "&password=" + Config.readConfig(path, "PASSWORD"));
             sqlStatement = connect.createStatement();
            System.out.println("conexion normal");
             } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
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
