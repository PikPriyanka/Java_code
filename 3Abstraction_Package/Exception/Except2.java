import java.util.*;

public class Except2{
	public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the number of elements in the array");
	   int n = sc.nextInt();
	   System.out.println("Enter the elements in the array");
	   int arr[]= new int[n];  

	   try{
		   for(int i=0;i<n;i++){
			   arr[i] = sc.nextInt();
		   }
		   System.out.println("Enter the index of the array element you want to access");
		   int a = sc.nextInt();
		   System.out.println("The array element at index "+a +": "+arr[a]);
           System.out.println("The array element successfully accessed");

	   }catch(Exception e){
		   System.out.println("java.lang.ArrayIndexOutOfBoundsException");
	   }
	}
}
		   
		    
