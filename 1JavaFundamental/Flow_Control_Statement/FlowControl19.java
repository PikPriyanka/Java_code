/* Write a program to print first 5 values which are divisible by 2, 3, and 5. */

public class FlowControl19
{
    public static void main(String[] args) 
    {   
	    int c=0;
		int i=1;
         while(i<200)
		  {
			 if((i%2==0) &&(i%3==0)&& (i%5==0))
			 {
 				 System.out.print(i+" ");
				 c++;
				 
			 }
			 i++;
			 if(c==5){ break;}
		  }
		
    }
}
