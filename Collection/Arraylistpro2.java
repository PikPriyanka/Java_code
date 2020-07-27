package arraylistprogram;

import java.util.*;

public class Arraylistpro2 {
    public static void main(String Arg[]){
     ArrayList<Integer> list = new ArrayList<Integer>();
     list.add(12);
     list.add(21);
     list.add(90);
     list.add(78);
     list.add(1);
     System.out.println("Largest element in list "+Collections.max(list));
     System.out.println("Smallest element in list "+Collections.min(list));
     Collections.sort(list);
     System.out.print(list+" ,");
    // System.out.println("Showing last digit "+list.addFirst(0,11));
     
    }    
}
