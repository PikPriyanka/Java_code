import java.util.Scanner;

public class String5{
   public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
	   String s = sc.nextLine();
	   int len = s.length();
       System.out.print(s.substring(1,len-1));
	}
}