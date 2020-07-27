import java.text.DateFormatSymbols;
import java.util.*;
public class List6{
	public static void main(String args[]){
        Vector<String> v = new Vector<String>();
        String[] months = new DateFormatSymbols().getMonths();
        for (int i = 0; i < months.length; i++) {
           String month = months[i];
           System.out.println( month);
           v.add(months[i]);
         }
	 }
}
