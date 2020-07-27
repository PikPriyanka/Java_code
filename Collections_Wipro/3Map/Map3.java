import java.util.*;
public class Map3{
	public static void main(String args[]){
		Map<String,String> h = new HashMap<String,String>();
        h.put("West Bengal","Kolkata");
        h.put("Delhi","New Delhi");
		h.put("Bihar","Patna");
		h.put("Goa","Panaji");
		h.put("Assam","Dispur");
		h.put("Gujarat","Gandhinagar");
		
        System.out.println("Iterator using to list All elements ");
		System.out.println("States    Capitals  ");
		Set set = h.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			Map.Entry me = (Map.Entry)it.next();
		    System.out.println(me.getKey()+" : "+me.getValue());
		} 

	  }
}
