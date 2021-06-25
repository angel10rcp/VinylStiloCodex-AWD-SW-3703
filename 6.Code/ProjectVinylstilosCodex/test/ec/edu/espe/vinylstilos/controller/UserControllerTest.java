/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vinylstilos.controller;

import ec.edu.espe.vinylstilos.model.User;
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
public class UserControllerTest {
    
    public UserControllerTest() {
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
     * Test of ShowUsers method, of class UserController.
     */
    @Test
    public void testShowUsers() {
        System.out.println("ShowUsers");
        UserController instance = new UserController();
        List<User> expResult = null;
        List<User> result = instance.ShowUsers();
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
     * Test of insertUser method, of class UserController.
     */
    @Test
    public void testInsertUser() {
        System.out.println("insertUser");
        User user = null;
        UserController instance = new UserController();
        
        try {
            instance.insertUser(user);
        }catch (Exception e) {
            System.out.println("e.getMessage()");
            System.out.println("stack in the catch test --> " + e.toString());
            e.printStackTrace();
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getUserById method, of class UserController.
     */
    @Test
    public void testGetUserById() {
        System.out.println("getUserById");
        String idUser = "";
        UserController instance = new UserController();
        User expResult = null;
        User result = instance.getUserById(idUser);
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
     * Test of putUser method, of class UserController.
     */
    @Test
    public void testPutUser() {
        System.out.println("putUser");
        String idUser = "";
        User user = null;
        UserController instance = new UserController();
        
        try {
            instance.putUser(idUser, user);
        }catch (Exception e) {
            System.out.println("e.getMessage()");
            System.out.println("stack in the catch test --> " + e.toString());
            e.printStackTrace();
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of deleteUser method, of class UserController.
     */
    @Test
    public void testDeleteUser() {
        System.out.println("deleteUser");
        String idUser = "";
        UserController instance = new UserController();
        
        try {
            instance.deleteUser(idUser);
        }catch (Exception e) {
            System.out.println("e.getMessage()");
            System.out.println("stack in the catch test --> " + e.toString());
            e.printStackTrace();
            fail("The test case is a prototype.");
        }
    }
    
}
