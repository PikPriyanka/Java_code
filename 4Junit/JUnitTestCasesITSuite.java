/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package JUnitTestCases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author tgaga
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({JUnitTestCases.Demo1IT.class, JUnitTestCases.EmployeeIT.class, JUnitTestCases.Demo2IT.class})
public class JUnitTestCasesITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
