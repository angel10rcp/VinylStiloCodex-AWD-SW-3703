/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vinylstilos.controller;

import ec.edu.espe.vinylstilos.model.Product;
import java.util.ArrayList;
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
public class ProductControllerNameTest {
    
    public ProductControllerNameTest() {
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
     * Test of getDataByName method, of class ProductControllerName.
     */
    @Test
    public void testGetDataByName() {
        System.out.println("getDataByName");
        String name = "";
        ProductControllerName instance = new ProductControllerName();
        Product expResult = null;
        Product result = instance.getDataByName(name);
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
     * Test of getData method, of class ProductControllerName.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        ProductControllerName instance = new ProductControllerName();
        ArrayList<Product> expResult = null;
        ArrayList<Product> result = instance.getData();
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
     * Test of postProduct method, of class ProductControllerName.
     */
    @Test
    public void testPostProduct() {
        System.out.println("postProduct");
        Product prod = null;
        ProductControllerName instance = new ProductControllerName();
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
     * Test of putProduct method, of class ProductControllerName.
     */
    @Test
    public void testPutProduct() {
        System.out.println("putProduct");
        String name = "";
        String description = "";
        ProductControllerName instance = new ProductControllerName();
        String expResult = "";
        String result = instance.putProduct(name, description);
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
