package linklistprog;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetProg {
    public static void main(String Ag[]){
      /* HashSet<String> has = new HashSet<String>();
        has.add("Ram");
        has.add("Shyam");
        has.add("Raju");
        has.add("Ram");
       // has.add(null);
        Iterator it = has.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/
      //LinkedHasSet
      LinkedHashSet <String> lhas = new LinkedHashSet<String>();
     lhas.add("apple");
     lhas.add("banana");;
     lhas.add("grapes");
     lhas.add("banana");
     lhas.add(null);
       Iterator itr = lhas.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }    
      
      
    }   
}
