/* Write a Java program to find if the given number is prime or not.*/

import java.util.Scanner;
public class FlowControl14{
  public static void main(String args[]){
	  if(args.length==0)
	  {
		System.out.print("Please enter an integer number");
	  }
	else{
	 int n= Integer.parseInt(args[0]);
	 int num = n,i;
     if(num==0|| num==1){
	    System.out.print(num+" is neither prime nor composite");}
		
	 else{
		 for( i=2;i<=num/2;i++)
         {
           if (num%i==0){
		  System.out.print(num +" is not  a prime number");
	      break;}
	    }
	   if(i==(num/2)+1){
	    System.out.print(num +" is a prime number");}
	 }
	 }
  }
}
