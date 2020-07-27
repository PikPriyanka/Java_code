/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package JUnitTestCases;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tgaga
 */
public class EmployeeIT {
    ArrayList<String> data = new ArrayList<String>();
    public EmployeeIT() {
        data.add("Raju");
        data.add("Gagan");
        data.add("Rajesh");
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of findName method, of class Employee.
     */
    @Test
    public void testFindName() {
        System.out.println("findName");
        ArrayList employees = data;
        String name = "Raju";
        Employee instance = new Employee();
        String expResult = "FOUND";
        String result = instance.findName(employees, name);
        assertEquals(expResult, result);
        
        name = "Raj";
        expResult = "NOT FOUND";
        result = instance.findName(employees, name);
        assertEquals(expResult, result);
    }
    
}
