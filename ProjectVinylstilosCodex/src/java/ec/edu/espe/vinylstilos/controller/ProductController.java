/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vinylstilos.controller;
import ec.edu.espe.vinylstilos.DataBaseConnection.DataBaseConnection;
import ec.edu.espe.vinylstilos.model.Product;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angel Cardenas
 */
public class ProductController {
    private DataBaseConnection dataBaseConnection;
    List<Product> dataProduct = new ArrayList<>();
    
    public ProductController(){
        dataBaseConnection = new DataBaseConnection();
    }
    
    public List<Product> readProduct(){
        dataBaseConnection.connect();
        String sql = "SELECT * FROM product";
        try{
        ResultSet sqlResult = dataBaseConnection.getSqlStatement().executeQuery(sql);
            while(sqlResult.next()&&(sqlResult !=null)){
                dataProduct.add(new Product(sqlResult.getString("IDPRODUCT"),sqlResult.getString("NAMEPRODUCT"),sqlResult.getString("DESCRIPTIONPRODUCT"),sqlResult.getString("IMAGEPRODUCT"),sqlResult.getFloat("PRICE"),sqlResult.getInt("AMOUNTPRODUCT"),sqlResult.getString("CATEGORY")));
            }

        } catch (Exception e) {
            System.out.println("e.getMessage()");
            System.out.println("stack in the catch --> "+ e.toString());
            e.printStackTrace();
        }   
        return dataProduct;
    }
    
    
 }