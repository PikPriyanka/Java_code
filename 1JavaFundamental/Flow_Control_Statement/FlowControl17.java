// Write a program to reverse a given number and print

 import java.util.Scanner;
public class FlowControl17{
  public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
	  int ld,rev=0;
	  while(num>0){
		  ld = num%10;
		  rev = rev*10+ld;
		  num = num/10;
	   }
     System.out.print(rev);
   }
}