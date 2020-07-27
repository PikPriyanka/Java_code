package linklistprog;

import java.util.Vector;

public class collection2 {
   public static void main(String Ad[]) 
   {
       Vector<Integer>  vec = new Vector<Integer>();
       vec.addElement(2);
       vec.addElement(3);
       System.out.println("Vector is "+vec +" and size is "+vec.capacity());
       vec.addElement(4);
       System.out.println("Vector is "+vec +" and size is "+vec.capacity());
       vec.ensureCapacity(8);
   }
}
   