
public class FlowControl6{
  public static void main(String args[]){
     
     if(args[0]=="female")
	   {
		   int age = Integer.parseInt(args[1]);
	      if(age>=1 && age <=58){
	
	        System.out.print("the percentage of interest is 8.2%.");
	      }
		  else {
		    System.out.print("the percentage of interest is 9.2%.");
		  }
		}
	else 
	    {
			int age = Integer.parseInt(args[1]);
		   if(age>=1 && age <=58)
		   {
	        System.out.print("the percentage of interest is 8.4");
		   }
		   else{
		    System.out.print("the percentage of interest is 10.5%.");
		   }
		}
	}
}

		 
	   
	
