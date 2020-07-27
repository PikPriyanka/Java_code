//Create an instance of Animal class and invoke the eat and sleep methods using this object.
//doubt
class Animal{
	 void eat(){System.out.println("Animal eats grass");}
	 void sleep(){
		 System.out.println("Animal sleeps in den");}
}
class Bird extends Animal{
     void eat(){		 
		 System.out.println("Birds eat aquatic plants"); 
        }
	 void sleep(){
		 System.out.println("Birds sleep in nest");}
	 void fly(){
		 System.out.println("Birds can fly in sky");
	 }
}
public class inheritance1{
	public static void main(String args[]){
		Bird a = new Bird();
		a.eat();
		a.sleep();
		a.fly();
		Animal b = new Animal();
		b.eat();
		b.sleep();
	}
}