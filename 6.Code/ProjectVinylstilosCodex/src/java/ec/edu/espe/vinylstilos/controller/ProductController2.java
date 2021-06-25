/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vinylstilos.controller;

import ec.edu.espe.vinylstilos.DataBaseConnection.DataBaseConnection;
import ec.edu.espe.vinylstilos.model.Product;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author pabli
 */
public class ProductControllerName {
    private Product product = new Product();
    private ArrayList<Product> prods = new ArrayList<>();
    private DataBaseConnection db;

    public ProductControllerName() {
        db = new DataBaseConnection();
    }
   
    public Product getDataByName(String name){
        db.connect();
        String sql = "select * from Product where NAMEPRODUCT='"+name+"';";
        
        try {
            ResultSet rec = db.getSqlStatement().executeQuery(sql);
            if(rec != null){
                rec.next();
                product = new Product(rec.getString("IDPRODUCT"),
                rec.getString("NAMEPRODUCT"),
                rec.getString("DESCRIPTIONPRODUCT"),
                rec.getString("IMAGEPRODUCT"),
                rec.getFloat("PRICE"),
                rec.getInt("AMOUNTPRODUCT"),
                rec.getString("CATEGORY"));
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("stack in the catchDel contro --> "+ e.toString());
            e.printStackTrace();
        }
        
        db.disconnect();
        return product;
    }
    
    public ArrayList<Product> getData(){
        db.connect();
        String sql = "select * from Product ;";
        
        try {
            ResultSet rec = db.getSqlStatement().executeQuery(sql);
            while(rec != null && rec.next() ){
                Product prod = new Product(rec.getString("IDPRODUCT"),
                rec.getString("NAMEPRODUCT"),
                rec.getString("DESCRIPTIONPRODUCT"),
                rec.getString("IMAGEPRODUCT"),
                rec.getFloat("PRICE"),
                rec.getInt("AMOUNTPRODUCT"),
                rec.getString("CATEGORY"));
                prods.add(prod);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("stack in the catchDel contro --> "+ e.toString());
            e.printStackTrace();
        }
        
        db.disconnect();
        return prods;
    }
    
    public String postProduct(Product prod){
        db.connect();
        String postResult = "";
        String sql = "insert into Product values('"+prod.getIdProduct()+"','"+prod.getNameProduct()+"','"
                +prod.getDescriptionProduct()+"','"+prod.getImageProduct()+"',"
                +prod.getPriceProduct()+","+prod.getAmountProduct()+",'"+prod.getCategoryProduct()+"');";
        
        try {
            ResultSet rec = db.getSqlStatement().executeQuery(sql);
            postResult = "insertado con exito";
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("stack in the catchDel contro --> "+ e.toString());
            e.printStackTrace();
            postResult = "error en el insert";
        }
        
        db.disconnect();
        return postResult;
    }
    
    public String putProduct(String name, String description){
        db.connect();
        String putResult = "";
        String sql = "update Product set DESCRIPTIONPRODUCT='"+description+"' where NAMEPRODUCT='"+name+"';";
        
        try {
            ResultSet rec = db.getSqlStatement().executeQuery(sql);
            putResult = "insertado con exito";
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("stack in the catchDel contro --> "+ e.toString());
            e.printStackTrace();
            putResult = "error en el insert";
        }
        
        db.disconnect();
        return putResult;
    }
}
