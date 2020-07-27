public class Except8
{
	public static void main(String args[]){
	 try{
	   String nam = args[0];
	   int age = Integer.parseInt(args[1]); 
       if(age >=18 && age <60){
		 System.out.println("valid age");
	    }
	   else{
		     throw new Exception("Invalid age");
	    }
       System.out.println("Name "+nam+" Age "+age);
	 }catch(IndexOutOfBoundsException e){
		 System.out.println("No valid arguments");
	 }
	 catch(Exception e){
		 System.out.print(e);
	   }
	}
}