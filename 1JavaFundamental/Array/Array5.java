// Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array

public class Array5{
  public static void main(String args[]){
     int a[]={45,5,89,54,77,21,30},temp=0;
	 for(int i=0;i<a.length;i++){
		 for(int j=0;j<a.length;j++){
			 if(a[i]<a[j]){
				 temp = a[j];
				 a[j]=a[i];
				 a[i]=temp;
			 }
		 }
	 }
	 System.out.print("largest 2 numbers "+a[a.length-2]+","+a[a.length-1]);
	 System.out.print(" and smallest two numbers "+a[0]+","+a[1]);
  }
}
     