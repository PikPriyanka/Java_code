class Box{
	int width,depth,height;
	Box(int w,int d,int h){
		this.width = w;
		this.height = h;
		this.depth = d;
	}
	int meth(int w,int d,int h){
		return (w*d*h);
	}
}
public class class1{
	public static void main(String args[]){
		Box b = new Box(23,45,20);
		System.out.print("volume of box is "+b.meth(12,1,2));
	}
}