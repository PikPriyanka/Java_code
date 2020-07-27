/*  Write a program to check if a given number is prime or not*/
import java.util.Scanner;
public class FlowControl12{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();
  int i;
    for( i=2;i<=num/2;i++)
     {
       if (num%i==0){
		  System.out.print("not prime");
	      break;}
	 }
	   if(i==(num/2)+1){
	    System.out.print("prime");}
	  
	 
	
   }
}