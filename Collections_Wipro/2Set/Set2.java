import java.util.*;
public class Set2{
	public static void main(String args[]){
      HashSet h = new HashSet();
	  h.add("Priyanka");
	  h.add("Anu");
	  h.add("AAmir");
	  h.add("Jyoti");
	  h.add("Nisha");
	  h.add("Varsha");
	  System.out.println("Hashset arrange randomly when it get iterator");
	  Iterator it = h.iterator();
	  while(it.hasNext())
		  System.out.println(it.next());
	}
}