																				
import java.util.Arrays; 
public class Array11{
  public static void main(String args[]){
	   int a[][] = new int[3][3];
	  if(args.length !=9){
		  System.out.print("Please enter 9 integer numbers");
	  }
	  else{
	   
	    a[0][0] = Integer.parseInt(args[0]);
	    a[0][1] = Integer.parseInt(args[1]);
		a[0][2] = Integer.parseInt(args[2]);
	    a[1][0] = Integer.parseInt(args[3]);
	    a[1][1] = Integer.parseInt(args[4]);
		a[1][2] = Integer.parseInt(args[5]);
		a[2][0] = Integer.parseInt(args[6]);
		a[2][1] = Integer.parseInt(args[7]);
		a[2][2] = Integer.parseInt(args[8]);
	    System.out.println("The given array is :");
	    for(int i=0;i<3;i++){
	       for(int j=0;j<3;j++){
			   System.out.print(a[i][j]+" ");
		   }
		   System.out.println();
		}
	  }
	  int temp= a[0][0];
	  for(int i=0;i<a.length;i++){
		 for(int j=0;j<a.length;j++){
			 if(a[i][j]>temp){
				 temp = a[i][j];
			 }
		 }
	 }
	 
	  System.out.println("The largest number in array is :" +temp);
   }
}