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
    
   public String postProduct(Product prod){
     dataBaseConnection.connect();
     String postResult = "";
        String sql = "insert into product values('"
                +prod.getIdProduct()+"','"
                +prod.getNameProduct()+"','"
                +prod.getDescriptionProduct()+"','"
                +prod.getImageProduct()+"',"
                +prod.getPriceProduct()+","
                +prod.getAmountProduct()+",'"
                +prod.getCategoryProduct()+"');";
       
        try {
            ResultSet rec = dataBaseConnection.getSqlStatement().executeQuery(sql);
            postResult = "insertado con exito";
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("stack in the catchDel contro --> "+ e.toString());
            e.printStackTrace();
            postResult = "error en el insert";
        }       
        dataBaseConnection.disconnect();
        return postResult;
    }
   
    public boolean deleteProductByID(String idProduct) {
        dataBaseConnection.connect();
        String sql = "DELETE FROM product where IDPRODUCT = '" + idProduct + "'";
        try {
            dataBaseConnection.getSqlStatement().executeQuery(sql);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("stack in the catch --> " + e.toString());
            e.printStackTrace();
           dataBaseConnection.disconnect();
            return false;
        }     
    } 
    
    public boolean updateProduct(String idProduct, Product product) {
        dataBaseConnection.connect();
        String sql = "UPDATE product SET NAMEPRODUCT='"+product.getNameProduct()+"', DESCRIPTIONPRODUCT='"+product.getDescriptionProduct()+"', IMAGEPRODUCT='"+product.getImageProduct()+"',PRICE= "+product.getPriceProduct()+", AMOUNTPRODUCT="+product.getAmountProduct()+" WHERE IDPRODUCT='T007';";
        try {
            dataBaseConnection.getSqlStatement().executeQuery(sql);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("stack in the catch --> " + e.toString());
            e.printStackTrace();
            dataBaseConnection.disconnect();
            return false;
        }
    }
 }