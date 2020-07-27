// Initialize an integer array with ascii values and print the corresponding character values in a single row.

public class Array4{
  public static void main(String args[]){
	  int a[] = {65,66,67,68,97};//array with ascii values
	  System.out.print("Ascii array character values are :");
	  char ch;
	  for(int i=0;i<a.length;i++)
	  {
		  ch=(char)a[i];
		  System.out.print("a["+i+"]="+ch+" ");
	  }
   }
  }
