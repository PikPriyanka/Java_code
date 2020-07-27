import java.util.*;
import java.io.*;
public class Except4{
	public static void main(String args[]){
	 try{
	  int n1 =Integer.parseInt(args[0]);
      int n2 =Integer.parseInt(args[1]);
	  int n3 =Integer.parseInt(args[2]);
	  int n4 =Integer.parseInt(args[3]);
	  int n5 =Integer.parseInt(args[4]);
      int a[] = new int[5];
	  a[0]=n1;
	  a[1]=n2;
	  a[2]=n3;
	  a[3]=n4;
	  a[4]=n5;
	  int sum=0;
	  double avg;
      for(int i=0;i<5;i++){
		  sum+=a[i];
	  }
	  System.out.println("sum "+sum);
	 avg = sum/5;
	 System.out.print("Average "+avg);
	 }catch(Exception e){
		 System.out.print(e);
	  }
    }
}