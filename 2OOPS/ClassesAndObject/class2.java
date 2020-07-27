import java.lang.Math;
class Calculator{
    static double powerInt(int num1,int num2){
	  return  (Math.pow((double)num1,(double)num2));
	}
	static double powerDouble(double num1,double num2){
	    return (Math.pow(num1,num2));
	}
}

public class class2{
	public static void main(String args[]){
      System.out.println("power of int var is "+(int)Calculator.powerInt(3,2));
	  System.out.println("power of double var is "+Calculator.powerDouble(4.3,2));
	  }
}