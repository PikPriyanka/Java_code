import java.util.*;
import java.math.*;
public class Map4{
	public static void main(String args[]){
		HashMap<BigInteger,String> h = new HashMap<BigInteger,String>();
		h.put(new BigInteger("7980647110"),"Aamir");
		h.put(new BigInteger("9903061329"),"Amar");
		h.put(new BigInteger("9999999999"),"Esha");
		h.put(new BigInteger("9898522212"),"Nikita");
		h.put(new BigInteger("8956255211"),"Munmum");
		h.put(new BigInteger("7854445574"),"Richa");
        
		System.out.println("Iterator use in hashmap");
		Set set = h.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			Map.Entry me = (Map.Entry)it.next();
		    System.out.println(me.getKey()+" : "+me.getValue());
		}

	  }
}
