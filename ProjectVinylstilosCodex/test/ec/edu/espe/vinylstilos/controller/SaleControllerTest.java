/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vinylstilos.controller;

import ec.edu.espe.vinylstilos.model.Sale;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author codex
 */
public class SaleControllerTest {
    
    public SaleControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of deleteSale method, of class SaleController.
     */
    @Test
    public void testDeleteSale() {
        System.out.println("deleteSale");
        String idSale = "";
        SaleController instance = new SaleController();
        
        try {
            instance.deleteSale(idSale);
        }catch (Exception e) {
            System.out.println("e.getMessage()");
            System.out.println("stack in the catch test --> " + e.toString());
            e.printStackTrace();
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of putSale method, of class SaleController.
     */
    @Test
    public void testPutSale() {
        System.out.println("putSale");
        String idSale = "";
        Sale sale = null;
        SaleController instance = new SaleController();
        
         try {
            instance.putSale(idSale, sale);
        }catch (Exception e) {
            System.out.println("e.getMessage()");
            System.out.println("stack in the catch test --> " + e.toString());
            e.printStackTrace();
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of postSale method, of class SaleController.
     */
    @Test
    public void testPostSale() {
        System.out.println("postSale");
        Sale sale = null;
        SaleController instance = new SaleController();
        Sale expResult = null;
        Sale result = instance.postSale(sale);
        try {
            assertEquals(expResult, result);
        }catch (Exception e) {
            System.out.println("e.getMessage()");
            System.out.println("stack in the catch test --> " + e.toString());
            e.printStackTrace();
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getSaleByIdSale method, of class SaleController.
     */
    @Test
    public void testGetSaleByIdSale() {
        System.out.println("getSaleByIdSale");
        String idSale = "";
        SaleController instance = new SaleController();
        Sale expResult = null;
        Sale result = instance.getSaleByIdSale(idSale);
        try {
            assertEquals(expResult, result);
        }catch (Exception e) {
            System.out.println("e.getMessage()");
            System.out.println("stack in the catch test --> " + e.toString());
            e.printStackTrace();
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of readSales method, of class SaleController.
     */
    @Test
    public void testReadSales() {
        System.out.println("readSales");
        SaleController instance = new SaleController();
        List<Sale> expResult = null;
        List<Sale> result = instance.readSales();
        try {
            assertEquals(expResult, result);
        }catch (Exception e) {
            System.out.println("e.getMessage()");
            System.out.println("stack in the catch test --> " + e.toString());
            e.printStackTrace();
            fail("The test case is a prototype.");
        }
    }
    
}
