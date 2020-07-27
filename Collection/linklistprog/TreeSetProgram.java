package linklistprog;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class TreeSetProgram {
    public static void main(String Arg[]){
      /*  TreeSet<String> set = new TreeSet<String>();
        set.add("8");
        set.add("4");
        set.add("9");
        set.add("1");
        set.add("8");
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }    */
        //HashMap
        HashMap<Integer,String> hmap = new HashMap<Integer,String>();
        hmap.put(1,"Hello");
        hmap.put(2,"goto");
        hmap.put(3,"Hell");
        hmap.remove("1");
       for(Map.Entry em : hmap.entrySet()) {
          // System.out.println(em);
           System.out.println(em.getKey());
           System.out.println(em.getValue());
           //System.out.println(em);
       }
    }
    
}
