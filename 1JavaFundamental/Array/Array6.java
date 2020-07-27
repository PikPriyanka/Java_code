// Write a program to initialize an array and print them in a sorted fashion

public class Array6{
  public static void main(String args[]){
	  int a[]={45,5,89,54,77,21,30},temp=0;
	  System.out.print("Unsorted array:");
	 for(int i=0;i<a.length;i++){
		 System.out.print(" "+a[i]);
	 }
    for(int i=0;i<a.length;i++){
		 for(int j=0;j<a.length;j++){
			 if(a[i]<a[j]){
				 temp = a[j];
				 a[j]=a[i];
				 a[i]=temp;
			 }
		 }
	 }System.out.println();
	 System.out.print("sorted array:");
	 for(int i=0;i<a.length;i++){
		 System.out.print(" "+a[i]);
	 }
  }
}
