/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package JUnitTestCases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tgaga
 */
public class Demo1IT {
    
    public Demo1IT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of stringConcat method, of class Demo1.
     */
    @Test
    public void testStringConcat() {
        System.out.println("stringConcat");
        String a = "abc";
        String b = "def";
        Demo1 instance = new Demo1();
        String expResult = "abcdef";
        String result = instance.stringConcat(a, b);
        assertEquals(expResult, result);
       
    }
    
}
