/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package JUnitTestCases;

import java.util.ArrayList;

/**
 *
 * @author tgaga
 */
public class Employee {
    public String findName(ArrayList employees,String name){
            String result="";
            if(employees.contains(name)){
             result="FOUND";
            }else{
             result="NOT FOUND";
            }
            return result;
       }
}
