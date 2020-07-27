import java.util.Scanner;

public class String9{
   public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
	   String s1 = sc.nextLine();
	   int len1 = s1.length();
	   String s2 = sc.nextLine();
	   int len2 = s2.length();
	   int len;
	   if(len1>len2)
		   len = len1;
	   else
		   len = len2;
       for(int i=0;i<len;i++){
		   if(len1>0 && len2>0){
		      System.out.print(s1.charAt(i)+""+s2.charAt(i));
		      len1--;
		      len2--;
		    }
		   else if(len1==0&&len2>0){
			   System.out.print(s2.charAt(i));
		   }
		   else if(len2==0&&len1>0){
			   System.out.print(s1.charAt(i));
		   }
			   
	   }
   }
}