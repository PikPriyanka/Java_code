
import java.util.Scanner;
public class FlowControl5{
  public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
	   char var = sc.next().charAt(0);
	   if(var >=48 && var<=57)
	      {
			  System.out.print("Digit");
	      }
	   else if( (var >='a'&& var<='z')||(var>='A' && var<='Z'))
	      {
			 System.out.print("Alphabhet");  
		  }
       else
	      {
			   System.out.print("Special Character");
		  }
	}
}
