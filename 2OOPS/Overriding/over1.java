class Fruit{
	
    void eat(){
		System.out.println("Fruit name: Grapes ,taste: sour");
	}
}
class Apple extends Fruit{
	void eat(){
		System.out.println("Fruit name: Apple ,taste: Sweat");

	}
}
class Orange extends Fruit{
	void eat(){
	    System.out.println("Fruit name: Orange , taste: Sweat");	
	}
}

public class over1{
	public static void main(String args[]){
     Orange ob1 = new Orange();
	 ob1.eat();
	}
}