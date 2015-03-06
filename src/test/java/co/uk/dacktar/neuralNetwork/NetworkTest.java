/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uk.dacktar.neuralNetwork;

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
public class NetworkTest {
    
    public NetworkTest() {
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
     * Test of learn method, of class Network.
     */
    @Test
    public void testLearn() {
        System.out.println("learn");
        Network instance = new NetworkImpl();
        instance.learn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of trial method, of class Network.
     */
    @Test
    public void testTrial() {
        System.out.println("trial");
        double[] input = null;
        Network instance = new NetworkImpl();
        instance.trial(input);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOutput method, of class Network.
     */
    @Test
    public void testGetOutput() {
        System.out.println("getOutput");
        Network instance = new NetworkImpl();
        double[] expResult = null;
        double[] result = instance.getOutput();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vectorLength method, of class Network.
     */
    @Test
    public void testVectorLength() {
        System.out.println("vectorLength");
        double[] v = null;
        double expResult = 0.0;
        double result = Network.vectorLength(v);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dotProduct method, of class Network.
     */
    @Test
    public void testDotProduct() {
        System.out.println("dotProduct");
        double[] vec1 = null;
        double[] vec2 = null;
        Network instance = new NetworkImpl();
        double expResult = 0.0;
        double result = instance.dotProduct(vec1, vec2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of randomizeWeights method, of class Network.
     */
    @Test
    public void testRandomizeWeights() {
        System.out.println("randomizeWeights");
        double[][] weight = null;
        Network instance = new NetworkImpl();
        instance.randomizeWeights(weight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class NetworkImpl extends Network {

        public void learn() throws RuntimeException {
        }

        public void trial(double[] input) {
        }
    }
    
}
