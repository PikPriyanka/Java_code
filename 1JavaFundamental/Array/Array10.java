
import java.util.*; 
public class Array10{
  public static void main(String args[]){
	  int a[][] = new int[2][2];
	  if(args.length !=4){
		  System.out.print("Please enter 4 integer numbers");
	  }
	  else{
	    a[0][0] = Integer.parseInt(args[0]);
	    a[0][1] = Integer.parseInt(args[1]);
	    a[1][0] = Integer.parseInt(args[2]);
	    a[1][1] = Integer.parseInt(args[3]);
	    System.out.println("The given array is :");
	    for(int i=0;i<2;i++){
	       for(int j=0;j<2;j++){
			   System.out.print(a[i][j]+" ");
		   }
		   System.out.println();
		}
		System.out.println("The reverse of array is");
		 for(int i=0;i<2;i++){
	       for(int j=0;j<2;j++){
			   System.out.print(a[j][i]+" ");
		   }
		   System.out.println();
		}
	}	
   }
}