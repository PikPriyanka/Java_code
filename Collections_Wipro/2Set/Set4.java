import java.util.*;
public class Set4{
	public static void main(String args[]){
       Country ob = new Country();
	   
	   ob.saveCountryNames("India");
	   ob.saveCountryNames("USA");
	   ob.saveCountryNames("America");
	   
	   System.out.println(ob.getCountry("India"));
	   System.out.println(ob.getCountry("USA"));
	   System.out.println(ob.getCountry("Austrial"));
	   System.out.println(ob.getCountry("America"));
	   
	}
}
class Country{
	   TreeSet<String> H1 = new TreeSet<String>();
	   Iterator i = H1.iterator();
	   public boolean saveCountryNames(String CountryName){
		   return H1.add(CountryName);
		   
	    }
        public String getCountry(String CountryName){
			if(H1.contains(CountryName))
				return CountryName;
			else 
				return null;
		 }
}