package arraylistprogram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Arraylistprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String>  list  = new ArrayList<String>();
        list.add("we");
        list.add("r");
        list.add("Indan");
        System.out.println(list);
        int n = sc.nextInt();
        int a[] = new int[100];int count=0;
         for(int i=0;i<n;i++){
             a[i]=sc.nextInt();
         }
        ArrayList<Integer> l = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            l.add(a[i]);
            
        }
        Iterator it = l.iterator();
        while(it.hasNext()){
             System.out.print(it.next()+",");
        }
        //Second type of declration of arraylist
			ArrayList arrlist = new ArrayList();
                          arrlist.add(1);
			  arrlist.add((int) 2.2);//any type of value allowed 
			  arrlist.add(4);
			  arrlist.add('a');//any kind of value allowed
			  arrlist.add(2,3);
			  arrlist.add(1,6);
			   Iterator itr = arrlist.iterator();
			 while(itr.hasNext()){
			    System.out.println(itr.next());
			}
           
        
    }
    
}
