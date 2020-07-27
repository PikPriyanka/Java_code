import java.util.*;
public class Collection4{
	public static void main(String[] args){
		ArrayList<Card> l = new ArrayList<Card>();
		TreeSet<Card> t = new TreeSet<Card>(new MyComparator());
		TreeSet<String> sym = new TreeSet<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Cards");
		int n = sc.nextInt();
		int i=1;
		while(i<=n){
			System.out.println("Enter Card "+i+":");
			String str = sc.next();
			int num = sc.nextInt();
			Card c = new Card(str,num);
			l.add(c);
			if(sym.add(str)){
			t.add(c);
		}
			i++;
		}
	 System.out.println("Distinct Symbols are :");
	Iterator<String> it = sym.iterator();
	while(it.hasNext())
		System.out.print(it.next()+" ");  
	System.out.println();
	  for(Card cr1:t){
		  int count =0,sum=0;
		  String s = cr1.getSymbol();
		  System.out.println("Cards in "+s+" Symbol");
		  for(Card cr2 :l){
			  if(s.equals(cr2.getSymbol())){
				  System.out.println(cr2.getSymbol()+" "+cr2.getNumber());
				  count++;
				  sum+=cr2.getNumber();
			  }
		  }
		  System.out.println("Number of cards : "+count);
		  System.out.println("Sum of Numbers : "+sum);
		  
	 }
  
}
}
class MyComparator implements Comparator{
	public int compare(Object o1,Object o2){
		Card c1 = (Card)o1;
		Card c2 = (Card)o2;
		if((c1.getSymbol().charAt(0))<(c2.getSymbol().charAt(0)))
			return -1;
		else
			return 1;
	}
}
class Card{
	String symbol;
	int number;
	public Card(String symbol,int number){
		this.symbol = symbol;
		this.number = number;
	}
	public String getSymbol(){
		return symbol;
	}
	public int getNumber(){
		return number;
	}
}
