/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.MyFile;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kostis.Mikroulis
 */
public class MyFileDaoTest {
    
    public MyFileDaoTest() {
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
     * Test of getById method, of class MyFileDao.
     */
    @Test
    public void testGetById() throws Exception {
        System.out.println("getById");
        int id = 1;
        MyFileDao instance = new MyFileDao();
//        MyFile expResult = null;
        MyFile result = instance.getById(id);
        assertEquals(id, result.getId());
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
