import java.util.Scanner;
interface LibraryUser {
   public void registerAccount();
   public void requestBook();
}

class KidUsers implements LibraryUser{
  private int age;
   private String bookType;
   KidUsers(int a,String b){
	   age = a;
	   bookType = b;
    }
  public void registerAccount(){
     if(age<12)
	   System.out.println("You have successfully registered under a Kids Account");
     else
	   System.out.println("Sorry, Age must be less than 12 to register as a kid");
   }
   public void requestBook(){
     if(bookType.equals("Kids")&& age < 12)
	   System.out.println("Book Issued successfully, please return the book within 10 days");
     else
       System.out.println("Oops, you are allowed to take only kids books"); 
	}
}
class AdultUser implements LibraryUser{
   private int age;
   private String bookType;
   AdultUser(int a,String b){
	   age = a;
	   bookType = b;
    }
   public void registerAccount(){
     if(age>12)
		System.out.println("You have successfully registered under an Adult Account"); 
     else
        System.out.println("Sorry, Age must be greater than 12 to register as an adult");
	}
   public void requestBook(){
	  if(bookType.equals("Fiction")&& age > 12)
	     System.out.println("Book Issued successfully, please return the book within 7 days");
	  else
		  System.out.println("Oops, you are allowed to take only adult Fiction books");
    }
}
public class LibraryInterfaceDemo {
	public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter account type(Kid/Adult), age and book type(Kids/Fiction): ");
        String actype = sc.next();
        int age = sc.nextInt();
        String bktype = sc.next();
        KidUsers ku;
        AdultUser au;
        if (actype.equals("Kid")) {
            ku = new KidUsers(age, bktype);
            au = null;
        }
        else {
            au = new AdultUser(age, bktype);
            ku = null;
        }

        if (ku != null) {
            ku.registerAccount();
            ku.requestBook();
        }

        if (au != null) {
            au.registerAccount();
            au.requestBook();
        }

	}
}
