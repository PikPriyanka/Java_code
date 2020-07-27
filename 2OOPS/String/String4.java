import java.util.Scanner;

public class String4{
   public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
	   String s = sc.nextLine();
	   int len = s.length();
	   if(len%2 == 0 ){
		   for(int i=0;i<len/2;i++){
		     System.out.print(s.charAt(i));
		   }
	   }
	   else{
		   System.out.print("null");
	   }
   }
}   
	   
