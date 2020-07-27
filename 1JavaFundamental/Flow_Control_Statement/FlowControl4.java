/* Initialize two character variables in a program and display the characters in alphabetical order.*/
import java.util.Scanner;
public class FlowControl4{
  public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
	   char item1 = 's';
	   char item2 = 'b';
	   if(item1>item2)
		    System.out.println(item2+","+item1);
       else
		   System.out.println(item1+","+item2);
   }
}
