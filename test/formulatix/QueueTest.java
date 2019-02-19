/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulatix;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bprasojo
 */
public class QueueTest {
    public QueueTest() {
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
     * Test of Enqueue method, of class Queue.
     */
    @Test
    public void testEnqueue() {
        System.out.println("Enqueue");
        int AData = 10;
        Queue instance = new Queue(AData);
        
        instance.Enqueue(100);
        instance.Enqueue(200);
        
        assertEquals(100,instance.Dequeue());
        assertEquals(200,instance.Dequeue());
        
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Dequeue method, of class Queue.
     */
    @Test
    public void testDequeue() {
        System.out.println("Dequeue");
        
        Queue instance = new Queue(5);
        
        instance.Enqueue(1000);
        instance.Enqueue(2000);
        
        int expResult = 1000;
        int result = instance.Dequeue();
        assertEquals(expResult, result);
        
        result = instance.Dequeue();
        assertEquals(2000,result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Queue.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Queue.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
