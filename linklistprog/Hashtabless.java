package linklistprog;

import java.util.Hashtable;

public class Hashtabless {
   public static void main(String as[])    {
       Hashtable<Integer,String> has = new Hashtable<Integer,String>();
       has.put(0,"Priyanka/");
       has.put(1,"27");
       has.put(2,"67");
       has.put(3,"Ayesha");
       has.put(4,"14");
       has.put(5,"76");
      
       int nm =0,r =1,mk=2;
       for(int i=0;i<has.size()/3;i++)
       {
           System.out.println("Name is"+has.get(nm));
           System.out.println("Name is"+has.get(r));
           System.out.println("Marks is"+has.get(mk));
                      nm+=3;
                      r+=3;
                      mk+=3;


       }
       
   }
}