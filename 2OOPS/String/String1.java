import java.util.Scanner;

public class String1{
   public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
	   String s = sc.nextLine();
	   String b = new String();
	   int len = s.length();
	   for(int i = len-1;i>=0;i--){
	       b = b+s.charAt(i);	
	   }
       if(b.equalsIgnoreCase(s)){
		   System.out.print("Palindrome");
	   }
	   else{
		   System.out.print("Not Palindrome");
	   }
    }
}