import java.util.*;
public class Map1{
	HashTable<String,String> M1 = new HashTable<String,String> ();
	public static void main(String [] args){
		Map1 mp = new Map1();
		System.out.println(mp.saveCountryCapital("India","Delhi"));
		System.out.println(mp.saveCountryCapital("Japan","Tokyo"));
		System.out.println(mp.saveCountryCapital("Pakistan","Lahore"));
		
		System.out.println("Capital of India using getCapital method is "+mp.getCapital("India"));
		System.out.println("Capital of Japan using getCapital method is "+mp.getCapital("Japan"));
		System.out.println("Capital of Pakistan using getCapital method is "+mp.getCapital("Pakistan"));
		
		System.out.println("Country of capital Delhi using getCountry method is "+mp.getCountry("Delhi"));
		System.out.println("Country of capital Tokyo using getCountry method is "+mp.getCountry("Tokyo"));
		System.out.println("Country of capital Lahore using getCountry method is "+mp.getCountry("Lahore"));
		
		System.out.println("Map having capital as key and country as value is "+mp.CapitalCountry());
		
		
		System.out.println("Arraylist having all countries of M1 as key is "+mp.Country());	
		
		
		
	}
		
	public  HashMap saveCountryCapital(String countryName, String capital){
			M1.put(countryName,capital);
			return M1;
		}
	public String getCapital(String CountryName){
		for(Map.Entry me : M1.entrySet()){
			if(CountryName.equals(me.getKey()))
				return (String)me.getValue();
		}
				return "No such Country Exist in the map";
		
	}
	public String getCountry(String capitalName){
		for(Map.Entry me : M1.entrySet()){
			if(capitalName.equals(me.getValue()))
				return (String)me.getKey();
		}
				return "No such Capital Exist in the map";
		
	}
	public Map CapitalCountry(){
		HashMap<String,String> M2 = new HashMap<String,String>();
		for(Map.Entry me : M1.entrySet()){
			M2.put((String)me.getValue(),(String)me.getKey());
		}
		return M2;
	}
	public ArrayList Country(){
		ArrayList<String> a = new ArrayList<String>(M1.keySet());
		return a;
		
	}
}