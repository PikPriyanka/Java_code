import java.util.Scanner;
import java.util.ArrayList;
import java.util.*; 
public class ArrayListspart{
        public static void  main(String Arg[]){
		     
			 ArrayList arrlist = new ArrayList();
              arrlist.add(1);
			  arrlist.add(2.2);//any type of value allowed 
			  arrlist.add(4);
			  arrlist.add('a');//any kind of value allowed
			  arrlist.add(2,3);
			  arrlist.add(1,6);
			   Iterator itr = arrlist.iterator();
			 while(itr.hasNext()){
			    System.out.println(itr.next());
			}
			
			
			ArrayList<String> a = new ArrayList<String>();
			a.add("Hello");
			a.add("java");
			
			  Iterator itr1= arrlist.iterator();
			 while(itr.hasNext()){
			    System.out.println(itr1.next());
			}
			
		}
    }
			  