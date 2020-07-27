/* Write a program to receive a color code from the user (an Alphabhet).*/

import java.util.Scanner;
public class FlowControl8{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
	char var = sc.next().charAt(0);
	switch(var)
	{
	  case 'R':
		   System.out.print("Red");
		   break;
	  case 'B':
		   System.out.print("Blue");
		   break;
	  case 'G':
		   System.out.print("Green");
		   break;
	  case 'O':
		  System.out.print("Orange");
		  break;
	  case 'Y':
		  System.out.print("Yellow");
		  break;
	  case 'W':
		  System.out.print("White");
		  break;
	  default:
		  System.out.print("Invalid Code");
	}
  }
}



