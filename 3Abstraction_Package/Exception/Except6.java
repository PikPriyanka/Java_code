import java.lang.*;
import java.io.*;
import java.util.*;
public class Except6{
   public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
	 System.out.print("enter the number of students: ");
	 int n = sc.nextInt();
	 float avg[] = new float[2];
	 int c=0;
	 try{
	 for(int i =0;i<n;i++){
		 int mark[]= new int[3];
		 int sum =0;
		 System.out.print("enter name of student ");
		 String name = sc.nextLine();		 
		 sc.next();
		 System.out.println("enter marks within 100 range:");
		 for(int j=0;j<3;j++){
			 mark[j]=sc.nextInt();
			 
		 }
		 for(int j=0;j<3;j++){
		    sum+=Math.abs(mark[j]);}
		 
		 avg[c+0]=sum/3;
		 c++;
		 System.out.print(name);
		 
	  }
	 System.out.println("First student has average marks "+avg[0]);
	 System.out.println("Second student has average marks "+avg[1]);
	 }catch(Exception e){
		 System.out.println(e);
	 }
   }
}