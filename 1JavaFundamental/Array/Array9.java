
import java.util.*; 
public class Array9{
  public static void main(String args[]){
   int []a={10,3,6,1,2,7,9};
   int i,j,sum=0,flag=0;
    if(a[0]== 6 &&a[a.length-1]==7){
	    sum =0;}
    else{
     for(i=0;i<a.length;i++){		
        j=i;
		if(a[i]== 6 &&i!=a.length-1){
			for(i=i+1;i<a.length;i++){
				 if(a[i]== 7 &&i!=a.length-1){
					 sum=sum+a[i+1];
					 i++;
					 flag =1;
					 break;
				 }
			}
			if(flag==0){
				sum+=a[j];
				i=j;
			}
		 }
		 else{
			 sum+=a[i];
		 }
		}
		System.out.print(sum);
	}
 }
}