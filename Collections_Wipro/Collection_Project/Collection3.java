import java.util.*;
class Card{
	String symbol;
	int number;
	public Card(String symbol,Integer number){
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
public class Collection3{
	public static void main(String [] args){
		TreeSet<Card> c = new TreeSet<Card>(new MyComparator());
		TreeSet<String> s = new TreeSet<String>();
		Scanner sc = new Scanner(System.in);
		String str;
		int num,i=0;
		int size=1;
		while(size<4){
		System.out.println("Enter a card");
		str = sc.next();
		num = sc.nextInt();
		Card c1 = new Card(str,num);
		if(s.add(str)){
			c.add(c1);
		}
			size = c.size();
            i++;			
		}
		System.out.println("Four Symbols gathered in "+i+"cards.");
		System.out.println("Cards in Set are:");
		for(Card cr:c){  
     System.out.println(cr.getSymbol()+""+cr.getNumber());  
    }
		
		
	
	}
}