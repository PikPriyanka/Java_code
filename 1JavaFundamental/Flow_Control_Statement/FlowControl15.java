 /*Write a program to add all the values in a given number and print. Ex: 1234->10*/

 import java.util.Scanner;
public class FlowControl15{
  public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
	  int ld,sum=0;
	  while(num>0){
		  ld= num%10;
		  sum += ld;
		  num= num/10;
	   }
     System.out.print(sum);
   }
}