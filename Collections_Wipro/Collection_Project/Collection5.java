import java.util.*;
import java.lang.*;
public class Collection5{
	public static void main(String [] args){
		TreeSet<Box> t = new TreeSet<Box>(new MyComparator());
		TreeSet<Double> vol = new TreeSet<Double>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Box");
		int n = sc.nextInt();
		int i=1;
		while(i<=n){
			System.out.println("Enter the Box "+i+" details");
			System.out.println("Enter Length");
		    double l = sc.nextDouble();
			System.out.println("Enter Width");
		    double w = sc.nextDouble();
			System.out.println("Enter Height");
		    double h = sc.nextDouble();
			Box b = new Box(l,w,h);
			if(vol.add(b.getVolume()))
				t.add(b);
			
			i++;
		}
		System.out.println("Unique Boxes in the Set are");
		for(Box b1:t){
			double v = Math.round(b1.getVolume()*100.0)/100.0;
			System.out.println("Length ="+b1.getLength()+" Width ="+b1.getWidth()+" Height ="+b1.getHeight()+" Volume="+v);
		}
		
		
	}
}
class Box{
	double length;
	double width;
	double height;
	public Box(double length,double width,double height){
		this.length = length;
		this.width = width;
		this.height = height;
		
	}
	public double getLength(){
		return length;
	}
	public double getWidth(){
		return width;
	}
	public double getHeight(){
		return height;
	}
	public double getVolume(){
		return (length*width*height);
	}
}
class MyComparator implements Comparator{
	public int compare(Object o1,Object o2){
		Box b1 = (Box)o1;
		Box b2 = (Box)o2;
		if(b1.getVolume()<b2.getVolume())
			return -1;
		else
			return 1;
	}
}