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
public class KohonenNetworkTest {
    
    public KohonenNetworkTest() {
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
     * Test of setTrainingSet method, of class KohonenNetwork.
     */
    @Test
    public void testSetTrainingSet() {
        System.out.println("setTrainingSet");
        TrainingSet set = null;
        KohonenNetwork instance = null;
        instance.setTrainingSet(set);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of copyWeights method, of class KohonenNetwork.
     */
    @Test
    public void testCopyWeights() {
        System.out.println("copyWeights");
        KohonenNetwork dest = null;
        KohonenNetwork source = null;
        KohonenNetwork.copyWeights(dest, source);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearWeights method, of class KohonenNetwork.
     */
    @Test
    public void testClearWeights() {
        System.out.println("clearWeights");
        KohonenNetwork instance = null;
        instance.clearWeights();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of normalizeInput method, of class KohonenNetwork.
     */
    @Test
    public void testNormalizeInput() {
        System.out.println("normalizeInput");
        double[] input = null;
        double[] normfac = null;
        double[] synth = null;
        KohonenNetwork instance = null;
        instance.normalizeInput(input, normfac, synth);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of normalizeWeight method, of class KohonenNetwork.
     */
    @Test
    public void testNormalizeWeight() {
        System.out.println("normalizeWeight");
        double[] w = null;
        KohonenNetwork instance = null;
        instance.normalizeWeight(w);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of trial method, of class KohonenNetwork.
     */
    @Test
    public void testTrial() {
        System.out.println("trial");
        double[] input = null;
        KohonenNetwork instance = null;
        instance.trial(input);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of winner method, of class KohonenNetwork.
     */
    @Test
    public void testWinner() {
        System.out.println("winner");
        double[] input = null;
        double[] normfac = null;
        double[] synth = null;
        KohonenNetwork instance = null;
        int expResult = 0;
        int result = instance.winner(input, normfac, synth);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of evaluateErrors method, of class KohonenNetwork.
     */
    @Test
    public void testEvaluateErrors() {
        System.out.println("evaluateErrors");
        double rate = 0.0;
        int learn_method = 0;
        int[] won = null;
        double[] bigerr = null;
        double[][] correc = null;
        double[] work = null;
        KohonenNetwork instance = null;
        instance.evaluateErrors(rate, learn_method, won, bigerr, correc, work);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adjustWeights method, of class KohonenNetwork.
     */
    @Test
    public void testAdjustWeights() {
        System.out.println("adjustWeights");
        double rate = 0.0;
        int learn_method = 0;
        int[] won = null;
        double[] bigcorr = null;
        double[][] correc = null;
        KohonenNetwork instance = null;
        instance.adjustWeights(rate, learn_method, won, bigcorr, correc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of forceWin method, of class KohonenNetwork.
     */
    @Test
    public void testForceWin() {
        System.out.println("forceWin");
        int[] won = null;
        KohonenNetwork instance = null;
        instance.forceWin(won);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of learn method, of class KohonenNetwork.
     */
    @Test
    public void testLearn() {
        System.out.println("learn");
        KohonenNetwork instance = null;
        instance.learn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initialize method, of class KohonenNetwork.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        KohonenNetwork instance = null;
        instance.initialize();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
