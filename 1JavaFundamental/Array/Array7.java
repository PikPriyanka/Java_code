//WAP toremove the duplicate elements in an array

import java.util.Arrays;
public class Array7{
  public static void main(String args[]){
     int a[]={12,34,12,45,67,89},j=0;
	 Arrays.sort(a);//sorting the array elements
	 int[] temp = new int[a.length];   
	   for (int i=0; i<a.length-1; i++){  
            if (a[i] != a[i+1]){  
                temp[j++] = a[i];  
            }  
         }  
        temp[j++] = a[a.length-1];     
        for (int i=0; i<j; i++){            
			System.out.print(temp[i]+" ");
        }
  }
}
