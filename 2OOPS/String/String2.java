import java.util.Scanner;

public class String2{
   public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
	   String s = sc.nextLine();
	   String r = sc.nextLine();
	   s=s.toLowerCase();
	   r=r.toLowerCase();
	   int len = s.length();
	   int lenr = r.length();
	   if(s.charAt(len-1)==r.charAt(0))
	   { 
	      System.out.print(s+""+r.substring(1,lenr));
	   }
	   else{
		    System.out.print(s+" "+r);
	   }
   }
}
