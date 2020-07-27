import java.util.Scanner;

public class String10{
   public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
	   String s = sc.nextLine();
	   int len = s.length();
       int n = sc.nextInt();
	   for(int i=0;i<n;i++){
	   System.out.print(s.substring(n-1,len));
	   }
	}
}