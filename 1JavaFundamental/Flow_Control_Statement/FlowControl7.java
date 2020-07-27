
import java.util.Scanner;
public class FlowControl7{
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
	  char var = sc.next().charAt(0);
	  if(var>=65 && var<=90)
	    {
			var = (char)(32+var);
		    System.out.print(var);
		}
	  else{
			var = (char)(var-32);
		    System.out.print(var);
			}
	}
}
		
	  