/*  Write a Program to accept two integers as command line arguments and print the sum of the two numbers
*/
public class lb3{
  public static void main(String args[]){
      int num1 = Integer.parseInt(args[0]);
	  int num2 = Integer.parseInt(args[1]);
	  int sum = num1+num2;
	  System.out.print("The sum of "+num1+" and "+num2+" is "+sum);
	}
}