import java.util.*;
import java.text.DateFormatSymbols;
public class List1{
   public static void main(String args[]){
      List<String> monthsList = new ArrayList<String>();
      String[] months = new DateFormatSymbols().getMonths();
      for (int i = 0; i < months.length; i++) {
        String month = months[i];
        System.out.println( month);
        monthsList .add(months[i]);
       }

	 }
}