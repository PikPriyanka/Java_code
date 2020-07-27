/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package JUnitTestCases;

/**
 *
 * @author tgaga
 */
public class Demo2 {
    boolean palindromeCheck(String value){
        return value.equals(new StringBuilder(value).reverse().toString());
    }
}
