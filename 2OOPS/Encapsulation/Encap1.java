class Author{
	String name;
	String email;
	char   gender;
	Author(String n,String e,char g){
		name = n;
		email = e;
	    gender = g;
	}
}
class Book{
    String Bname;
	double price;
	int qtyInStock;
	Book(String n,double p,int q){
		Bname = n;
		price = p;
		qtyInStock = q;
	}
	public String getName(){
	   return Bname; }	  
	public double getPrice(){
	   return price; }
	public int getQty(){
	   return qtyInStock; }
	   
	public void setName(String Bname){
	   this.Bname = Bname; }	  
	public void setPrice(double price){
	   this.price = price; }
	public void setQty(int qtyInStock){
	   this.qtyInStock = qtyInStock; }
}
public class Encap1{
	public static void main(String args[]){
		Book b = new Book("C Book",400,2);
		b.setName("Java Book");
		b.setPrice(500);
		b.setQty(5);
		Author author =  new Author("Oracle","java@gmail.com",'M');
		System.out.println("Book Name: "+b.getName() +"\nPrice: "+b.getPrice() +"\nQuantity In Stock: "+b.getQty());
		System.out.println("\nAuthor name: "+author.name+"\nemail id : "+author.email+"\nGender: "+author.gender);
	}
}
		