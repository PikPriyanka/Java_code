import java.text.DateFormatSymbols;
import java.util.*;
public class List5{
	public static void main(String args[]){
        LinkedList<String> monthsList =new LinkedList<String>();  
        String[] months = new DateFormatSymbols().getMonths();
        for (int i = 0; i < months.length; i++) {
           String month = months[i];
           System.out.println( month);
           monthsList.add(months[i]);
         }
	 }
}
