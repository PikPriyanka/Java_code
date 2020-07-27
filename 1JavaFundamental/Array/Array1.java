// Write a program to initialize an integer array and print the sum and average of the array
import java.util.*;
public class Array1{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int a[] = new int[n];
	 //Initialization of array
	 int sum=0;
	 System.out.println("enter array");
	 for(int i=0;i<n;i++)
	   {
	    a[i] = sc.nextInt();
		sum = sum +a[i];
	   }
	   System.out.println("Sum "+sum);
	   float avg = (float)sum/n;
	   System.out.println("Average "+avg);
	}
}
     