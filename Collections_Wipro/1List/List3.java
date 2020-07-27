import java.util.*;
public class List3{
	public static void main(String args[]){
       ArrayList<String> list = new ArrayList<String>();
       list.add("Hi");
       list.add("Go");
       list.add("Ritu");	
       PrintAll(list);
	}
	public static void PrintAll(ArrayList list){
		Iterator<String> it = list.iterator();
		 while(it.hasNext()){
			  System.out.println(it.next());
		   }
	}	
}