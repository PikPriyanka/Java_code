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
public class Demo2IT {
    
    public Demo2IT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of palindromeCheck method, of class Demo2.
     */
    @Test
    public void testPalindromeCheck() {
        System.out.println("palindromeCheck");
        String value = "HELLO";
        Demo2 instance = new Demo2();
        boolean expResult = false;
        boolean result = instance.palindromeCheck(value);
        assertEquals(expResult, result);
        
        value = "MADAM";
        expResult = true;
        result = instance.palindromeCheck(value);
        assertEquals(expResult, result);
        
    }
    
}
