package linklistprog;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkListProg {
    public static void main(String[] args) {
             LinkedList <String> list = new LinkedList<String>();
             list.add("a");
             list.add("b");
             list.add("d");
             
             System.out.println("list is "+list);
             System.out.println("list size "+list.size());
           /*  Iterator itr = list.iterator();
             while(itr.hasNext()){
                 System.out.println(itr.next());
             }*/
                                  
        //operations in linked list
        
        /*adding elements at positions */
        // add 'c' at third index and indices start from 0
        System.out.println("Before adding c the list is "+list);
         list.add(2,"c");
         System.out.println("After adding c the list is "+list);
         
        /* add elent at first */
        // add 'start' at first place
        System.out.println("Before adding Start the list is "+list);
        list.addFirst("Start");
        System.out.println("Before adding Start the list is "+list);
        /* add element at last */
        // add 'end' at last place
        System.out.println("Before adding end the list is "+list);
        list.addLast("end");
        System.out.println("After adding end the list is "+list);
         /*update an element in the list */
         // we will update element at index 3 i.e 'c' to 'C'
         System.out.println("Before updating the list is "+list);
         list.set(3, "C");
         System.out.println("After updating the list is "+list);
        
        /*Updating all elements in the list to upper case */
        Iterator it = list.iterator();
        int count=0;
        while(it.hasNext()){
            String str ;
            str = it.next().toString();
            list.set(count++,str.toUpperCase());
        }
         System.out.println("After updating the list into UpperCase is "+list);
                  /*deletion of elements in list */
         //first element
         list.removeFirst();
          System.out.println("List after deleting first is "+list);
          //last element
          list.removeLast();
          System.out.println("List after deleting last is "+list);
          //removing 2 index element
          list.remove(2);
          System.out.println("List after deleting index 2 is "+list);
                  
    }
    
}
