
import java.util.*;
public class WrapperClasses3{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
	 int num = sc.nextInt();
	 int  bin =Integer.valueOf(Integer.toBinaryString(num));
	 System.out.print(String.format("%08d",bin));
  }
}