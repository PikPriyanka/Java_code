//Java program to find the most frequent element in an array 

import java.util.*; 
public class Array8{
  public static void main(String args[]){
	    int arr[] = {10,20,30,10,40,10,20,30,10},n=arr.length;
        Arrays.sort(arr); 
        int max_count = 1, res = arr[0]; 
        int curr_count = 1; 
          
        for (int i = 1; i < n; i++) 
        { 
            if (arr[i] == arr[i - 1]) 
                curr_count++; 
            else 
            { 
                if (curr_count > max_count) 
                { 
                    max_count = curr_count; 
                    res = arr[i - 1]; 
                } 
                curr_count = 1; 
            } 
        } 
      
        // If last element is most frequent 
        if (curr_count > max_count) 
        { 
            max_count = curr_count; 
            res = arr[n - 1]; 
        } 
      
        System.out.print(res);
    } 
}
