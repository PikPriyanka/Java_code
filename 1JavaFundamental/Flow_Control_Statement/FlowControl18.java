/*  Write a Java program to find if the given number is palindrome or not*/

 
public class FlowControl18{
  public static void main(String args[]){
	  
	   if(args.length==0)
	   {
		System.out.print("Please enter an integer number");
	   }
	else{
	   int ld,rev=0;
	  int num1= Integer.parseInt(args[0]);
	  int num= num1;
	  while(num>0){
		  ld= num%10;
		  rev = rev*10+ld;
		  num= num/10;
	   }
	   if(num1== rev){
	      System.out.print(num1+" is a palindrome");
		  }
	   else{
		   System.out.print(num1+" is not a palindrome");
		   }
	}
   }
}