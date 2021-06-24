/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vinylstilos.controller;

import ec.edu.espe.vinylstilos.DataBaseConnection.DataBaseConnection;
import ec.edu.espe.vinylstilos.model.Sale;
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
 * @author Lenovo
 */
public class SaleController {
    
    public SaleController() {
    
    }
    public Sale postSale(Sale sale){
        Statement statement = null;        
        DataBaseConnection connection = new DataBaseConnection();
        try{
            connection.connect();
            statement = connection.getSqlStatement();
            
            String sql = "INSERT INTO sale VALUES('" + sale.getIdSale() + "','" + sale.getIdUser() + "','" + sale.getTotalSale()+ "','" + sale.getDate() + "');";
            ResultSet res = statement.executeQuery(sql);
            
        }catch(SQLException ex){
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return sale;
    }
    public Sale getSaleByDate(String dateSale){
        
        Sale wantedSale = new Sale();
        
        List<Sale> saleList = this.readSales();
        for (int i=0;i<saleList.size();i++) {
            if(dateSale.equals(saleList.get(i).getDate())){
                wantedSale = saleList.get(i);
            }
        }
        return wantedSale;
    }
    public List<Sale> readSales(){
        Statement statement = null;
        List<Sale> saleList = new ArrayList<>();
        
        DataBaseConnection connection = new DataBaseConnection();
        try{
            
            statement = connection.getSqlStatement();
            
            String sql = "SELECT * FROM sale";
            ResultSet res = statement.executeQuery(sql);
            
            while((res != null) && (res.next())){
               saleList.add(new Sale( res.getString("idSale"), res.getString("idUser"),res.getFloat("totalScore"),res.getString("date")));
            }
            
        }catch(SQLException ex){
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return saleList;       
    }
}
