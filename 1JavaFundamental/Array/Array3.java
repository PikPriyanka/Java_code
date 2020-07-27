/*Write a program to initialize an integer array with values and check if a given number is present in the array or not*/

import java.util.*;
public class Array3{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
	 int n =5,c=0;
	 boolean flag = false;
	 int a[] = {1,4,34,56,7};
	 System.out.print("enter searched element:");
	 int find = sc.nextInt();
	   for (int i=0;i<n;i++) {
            if (a[i] == find) {
                flag = true;
				c=i;
                break;
            }
	   }
	if(flag)
		System.out.print(c+1);
	else
		System.out.print("-1");
  }
}
		