import java.util.*;

public class Except9{
	public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the 2 numbers");
	   int a = sc.nextInt();
	   int b = sc.nextInt();
	   try{
		   int c = a/b;
		   System.out.println("The quotient of "+a+"/"+ b +" = "+c);
	   }catch(Exception e){
		   System.out.println("DivideByZeroException caught");
	   }
	   finally{
		   System.out.println("Inside finally block");
	   }
	}
}
		   

