import java.util.Scanner;
import java.util.ArrayList;
 
public class ArrayLists{
        public static void  main(String Arg[]){
		     
			 ArrayList<String> arrlist = new ArrayList<String>();
			 Scanner sc = new Scanner();
			 System.out.println("Enter array no");
			 int n = sc.nextInt();
			 String num;
			 
			 for(int i =0;i < n;i++)
			 {
			     arrlist.add(num);
			 }
			 Iterator it = arrlist.Iterator();
			 while(it.hasNext()){
			    System.out.println(it.next());
			}
		}
    }
			 