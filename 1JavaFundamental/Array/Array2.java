// Write a program to initialize an integer array and find the maximum and minimum value of an array

public class Array2{
  public static void main(String args[]){
	 int a[] ={23,45,98,78,44,20};
	 int temp=0;
	 for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
			if(a[i]>a[j]){
				temp = a[i];
				a[i] = a[j];
                a[j] = temp;
			}				
		 }	
	  }
	 System.out.println("maximum and minimum value "+a[0]+" "+a[a.length-1]);
	 }
  }	 
