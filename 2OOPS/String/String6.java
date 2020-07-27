import java.util.Scanner;

public class String6{
   public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
	   String s1 = sc.nextLine();
	   int len1 = s1.length();
       String s2 = sc.nextLine();
	   int len2 = s2.length();
	   if(len2>len1){
	       System.out.print(s1.trim()+s2.trim()+s1);
		}
		else if(len1>len2){
			System.out.print(s2+s1+s2);
		}
	 }
}