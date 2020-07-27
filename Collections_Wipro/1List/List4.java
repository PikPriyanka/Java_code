//Create an ArrayList that can store only numbers like int,float,double,etc, but not any other data type.
import java.util.*;
public class List4{
	public static void main(String args[]){
       ArrayList<Number> l = new ArrayList<Number>();
	   l.add(12);
	   l.add(34.56);
	   l.add(34.5666);
	   l.add(34);
		Iterator<Number> it = l.iterator();
		while(it.hasNext()){
			  System.out.println(it.next());
		   }
	}	
}
