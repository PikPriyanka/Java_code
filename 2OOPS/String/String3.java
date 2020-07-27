import java.util.Scanner;

public class String3{
   public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
	   String s = sc.nextLine();
	   int len = s.length();
	   for(int i =0;i<len;i++){
		   System.out.print(s.charAt(0));
		   System.out.print(s.charAt(1));
	   }
   }
}
