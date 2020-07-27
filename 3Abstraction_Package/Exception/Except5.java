import java.io.*;
import java.util.*;
public class Except5{
	 static void division() throws ArithmeticException
	  {
		   Scanner sc = new Scanner(System.in);
		   int m = sc.nextInt();
	       int n = sc.nextInt();
          
		 int div;
	     try{
			 
	       div = m/n;
		   System.out.print("division of "+m +" and "+n+" is "+div);
	       }catch(ArithmeticException e){
		     System.out.print(e);
			}
	  }

	public static void main(String args[]){
        division();
	       
   }
}