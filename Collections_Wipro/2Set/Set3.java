import java.util.*;

public class Set3{
	public static void main(String args[]){
		
       TreeSet<String> set=new TreeSet<String>();  
	   TreeSet<String> rev=new TreeSet<String>();  
	   
       set.add("Aa");
	   set.add("B");
	   set.add("C");
	   set.add("D");
	   set.add("E");
	   set.add("F");
	   
	   System.out.println(" In Reversing order:");
	   rev = (TreeSet)set.descendingSet();
	   System.out.println(rev);
	   
	   System.out.println("Elements in TreeSet using iterator:");
	   Iterator it = set.iterator();
	   while(it.hasNext()){
	     System.out.println(it.next()); }
	  
	   System.out.println("Checking Particular elements in treeset");
	   System.out.println(set.contains("1"));
	   System.out.println(set.contains("2"));
	   System.out.println(set.contains("3"));
	   System.out.println(set.contains("4"));
	}
}
	   