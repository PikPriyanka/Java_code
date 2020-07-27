import java.util.*;

class Employee1{
	String emailid;
}
class Employee2 implements Cloneable{
	String namea,empidb;
	Employee1 c = new Employee1();
	    public Object clone() throws CloneNotSupportedException 
    { 
        return super.clone(); 
    } 
}	
public class WrapperClasses4 {
	public static void main(String args[])throws CloneNotSupportedException  { 
	  Employee2 e1 = new Employee2();
	  e1.namea = "Priyanka";
	  e1.empidb = "8300563";
	  e1.c.emailid = "priyanka@gmail.com";
	  
	  Employee2 e2 = (Employee2)e1.clone();
	  e2.namea ="Aamir";
	  e2.empidb = "858200";
      e2.c.emailid = "aamir@gmail.com";
      System.out.print("Employee1 properties are :");
	  System.out.println("Name :"+e1.namea +" empid :"+e1.empidb +" Email id :"+e1.c.emailid);
	  System.out.print("Employee2 properties after using colne :");
	  System.out.print("Name :"+e2.namea +" empid :"+e2.empidb +" Email id :"+e2.c.emailid);


	} }
