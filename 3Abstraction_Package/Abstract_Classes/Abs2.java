 import java.util.Random; 
abstract class Compartment {
     public abstract void notice();
}
class FirstClass extends Compartment{
	 public void notice(){
		System.out.println("First class compartment(Reserved use only)"); 
	 }
}
class Ladies extends Compartment{
	public void notice(){
       System.out.println("Reserved for ladies"); 	
	  }
}
class General extends Compartment{
	public void notice(){
      System.out.println("General compartment"); 
	 }
}
class Luggage extends Compartment{
	public void notice(){
		 System.out.println("Compartment for luggages"); 
	 }
}
public class Abs2{
	public static void main(String args[]){
		Compartment comp[] = new Compartment[10];
        Random rnd=new Random(); 
	    int num=0;
		for(int i=0;i<10;i++) {
			num=rnd.nextInt(4); 
			if(num==0) 
				comp[i]=new FirstClass();
			else if(num==1) 
				comp[i]=new Ladies();
			else if(num==2) 
				comp[i]=new General(); 
			else 
				comp[i]=new Luggage(); 
			comp[i].notice(); 
		
		} 
	}
}