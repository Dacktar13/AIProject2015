/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uk.dacktar.database;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Seth Wheeler
 */
public class MemoryTest {
    
    public MemoryTest() {
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
     * Test of getId method, of class Memory.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Memory instance = new Memory();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Memory.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Memory instance = new Memory();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNodes method, of class Memory.
     */
    @Test
    public void testGetNodes() {
        System.out.println("getNodes");
        Memory instance = new Memory();
        String expResult = "";
        String result = instance.getNodes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNodes method, of class Memory.
     */
    @Test
    public void testSetNodes() {
        System.out.println("setNodes");
        String nodes = "";
        Memory instance = new Memory();
        instance.setNodes(nodes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeight method, of class Memory.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Memory instance = new Memory();
        int expResult = 0;
        int result = instance.getWeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWeight method, of class Memory.
     */
    @Test
    public void testSetWeight() {
        System.out.println("setWeight");
        int weight = 0;
        Memory instance = new Memory();
        instance.setWeight(weight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSymbol method, of class Memory.
     */
    @Test
    public void testGetSymbol() {
        System.out.println("getSymbol");
        Memory instance = new Memory();
        Character expResult = null;
        Character result = instance.getSymbol();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSymbol method, of class Memory.
     */
    @Test
    public void testSetSymbol() {
        System.out.println("setSymbol");
        Character symbol = null;
        Memory instance = new Memory();
        instance.setSymbol(symbol);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Memory.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Memory instance = new Memory();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Memory.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Memory instance = new Memory();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Memory.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Memory instance = new Memory();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
