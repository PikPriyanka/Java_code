/* Write a program to print prime numbers between 10 and 99.*/

import java.util.Scanner;
public class FlowControl13{
  public static void main(String args[]){
    int num1=10,num2=99,num;
    int i;
	while(num1<=num2){
	  num = num1;
    for( i=2;i<=num/2;i++)
     {
       if (num%i==0){
	      break;}
	 }
	   if(i==(num/2)+1){
	    System.out.print(num+" ");}
	num1++;
	}
   }
}