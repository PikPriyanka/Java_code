import java.util.*;
public class Map2{
	public static void main(String args[]){
		Map<Integer,String> h = new HashMap<Integer,String>();
		h.put(100,"Aamir");
		h.put(101,"Amit");
		h.put(102,"Priyu");
		h.put(103,"Neha");
		h.put(104,"kajal");
		System.out.println("Checking particular key exists or not");
		
		System.out.println("Key 100 exists in HashMap? :"+h.containsKey(100));
		boolean flag1 = h.containsKey(105);
		System.out.println("Key 105 exists in HashMap? :"+flag1);
		boolean flag2 = h.containsKey(104);
		System.out.println("Key 104 exists in HashMap? :"+flag2);
		
		System.out.println("Checking particular value exists or not");
		boolean flag3 = h.containsValue("Aamir");
		System.out.println("Value Aamir exists in HashMap? :"+flag3);
		boolean flag4 = h.containsValue("Priya");
		System.out.println("Value Priya exists in HashMap? :"+flag4);
		
		System.out.println("Iterator use in hashmap");
		Set set = h.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			Map.Entry me = (Map.Entry)it.next();
		    System.out.println(me.getKey()+" : "+me.getValue());
		}
		
	  }
}
