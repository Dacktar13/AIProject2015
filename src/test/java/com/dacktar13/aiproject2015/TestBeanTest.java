/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dacktar13.aiproject2015;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mat
 */
public class TestBeanTest {
    
    public TestBeanTest() {
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
     * Test of getStringTest method, of class TestBean.
     */
    @org.junit.Test
    public void testGetStringTest() {
        System.out.println("getStringTest");
        TestBean instance = new TestBean("test1", 1);
        String expResult = "test1";
        String result = instance.getStringTest();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setStringTest method, of class TestBean.
     */
    @org.junit.Test
    public void testSetStringTest() {
        System.out.println("setStringTest");
        String stringTest = "test";
        String expResult = "test";
        
        TestBean instance = new TestBean();
        instance.setStringTest(stringTest);
        String result = instance.getStringTest();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of getIntTest method, of class TestBean.
     */
    @org.junit.Test
    public void testGetIntTest() {
        System.out.println("getIntTest");
        TestBean instance =  new TestBean("", 5);
        int expResult = 5;
        int result = instance.getIntTest();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIntTest method, of class TestBean.
     */
    @org.junit.Test
    public void testSetIntTest() {
        System.out.println("setIntTest");
        int intTest = 5;
        TestBean instance = new TestBean();
        instance.setIntTest(intTest);
        int result = instance.getIntTest();
        
        assertEquals(intTest, result);
    }

    /**
     * Test of hashCode method, of class TestBean.
     */
    @org.junit.Test
    public void testHashCode() {
        System.out.println("hashCode");
        TestBean instance = new TestBean("asd", 5);
        TestBean instance2 = new TestBean("asd", 5);
        
        int expResult = instance2.hashCode();
        int result = instance.hashCode();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class TestBean.
     */
    @org.junit.Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        TestBean instance = new TestBean("asd", 5);
        TestBean instance2 = new TestBean("asd", 5);
        
       
        assertEquals(instance, instance2);
    }
    
}
