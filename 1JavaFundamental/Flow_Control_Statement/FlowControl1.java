// Write a program to check if a given integer number is Positive, Negative, or Zero. 


import java.util.Scanner;
public class FlowControl1{
  public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();
	  if(num>0)
	  {
		  System.out.print("Positive");
	  }
	  else if (num<0)
	  {
		  System.out.print("Negative");
	  }
	  else{
		  System.out.print("Zero");
	  }
  }
}
