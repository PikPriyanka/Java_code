import java.util.Scanner;

public class String8{
   public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
	   String s = sc.nextLine();
	   StringBuffer str = new StringBuffer(s);
	   
	   int len = str.length();
	   int count =0;
	   for(int i=0;i<len;i++){
	     if(str.charAt(i) == '*'){
			 count=i;
		 }
	   }
	   str.delete(count-1,count+2);
	   System.out.print(str);
   }
}
 