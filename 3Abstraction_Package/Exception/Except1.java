import java.util.*;

public class Except1{
	public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter an integer: ");
	  
	   try{
		    int n = sc.nextInt();
			System.out.println("The square value is:"+(int)Math.pow(n,2));
			System.out.print("The work has been done successfully");

	   }catch(Exception e){
		   System.out.print("Entered input is not a valid format for an integer.");
	   }
	}
}
	   
