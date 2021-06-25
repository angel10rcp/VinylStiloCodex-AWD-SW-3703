/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vinylstilos.controller;

import ec.edu.espe.vinylstilos.model.Product;
import java.util.ArrayList;
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
public class ProductControllerTest {
    
    public ProductControllerTest() {
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
     * Test of readProduct method, of class ProductController.
     */
    @Test
    public void testReadProduct() {
        System.out.println("readProduct");
        ProductController instance = new ProductController();
        List<Product> expResult = new ArrayList<Product>();
        List<Product> result = instance.readProduct();
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
     * Test of postProduct method, of class ProductController.
     */
    @Test
    public void testPostProduct() {
        System.out.println("postProduct");
        Product prod = null;
        ProductController instance = new ProductController();
        String expResult = "";
        String result = instance.postProduct(prod);
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
     * Test of deleteProductByID method, of class ProductController.
     */
    @Test
    public void testDeleteProductByID() {
        System.out.println("deleteProductByID");
        String idProduct = "";
        ProductController instance = new ProductController();
        boolean expResult = false;
        boolean result = instance.deleteProductByID(idProduct);
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
     * Test of updateProduct method, of class ProductController.
     */
    @Test
    public void testUpdateProduct() {
        System.out.println("updateProduct");
        String idProduct = "";
        Product product = null;
        ProductController instance = new ProductController();
        boolean expResult = false;
        boolean result = instance.updateProduct(idProduct, product);
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
