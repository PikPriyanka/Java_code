import java.util.Scanner;

public class String7{
   public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
	   String s = sc.nextLine();
	   int len = s.length();
	   if(s.startsWith("x")&& s.endsWith("x"))
	    {
	      System.out.print(s.substring(1,len-1));
		}
	   else{
	      System.out.print(s);
		}
	}
}
