import java.util.*;
public class List7{
	public static void main(String args[]){
        Vector<String> v = new Vector<String>();
		v.add("Priyanka");
		v.add("1234");
		v.add(1,"ps62641@gmail.com");
		Enumeration en = v.elements();
		System.out.println("Vector Elements are");
		while(en.hasMoreElements())
		   System.out.println(en.nextElement());	
	}
}
        