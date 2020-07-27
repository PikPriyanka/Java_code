import java.util.Scanner;
class InvalidCountryException extends Exception{
	public InvalidCountryException(String s){
		super(s);
	}
}
class UserRegistration{
	void registerUser(String username,String userCountry) {
      String c ="India";	  
	  if(userCountry.equals(c)){
		   System.out.println("User registration done successfully");
	   }
	   else{
		   try{
		     throw new InvalidCountryException("InvalidCountryException should be thrown.");
		     
		    }catch(InvalidCountryException e){
				System.out.println(e.getMessage()); 

				System.out.println("User Outside India  cannot be registered");
			}
	   }
	}	
}
public class Except7{
	public static void main(String args[]){
		UserRegistration ob = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		String name =sc.nextLine();
		String country =sc.nextLine();
		ob.registerUser(name,country);
	}
}	

