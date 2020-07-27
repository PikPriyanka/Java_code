/*  Write a program to print even numbers between 23 and 57.*/
public class FlowControl11{
  public static void main(String args[]){
   int num1 =23,num2=57;
   for(int i= num1;i<=num2;i++)
     {
	    if( i % 2 == 0){
			System.out.println(i);
		 }
	  }
  }
}