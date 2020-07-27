import java.util.*;
import java.io.FileWriter;
import java.io.IOException;


public class Collection1{
	public static void main(String[] args){
		TreeSet<Employee> t = new TreeSet<Employee>(new MyComparator());
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number of Employees");
		int n = sc.nextInt();
		String fname,lname,mobile,email,add;
		int i=1;
		while(i<=n){
			System.out.println("Enter Employee "+i+"Details");
			System.out.println("Enter the Firstname");
			fname = sc.next();
			System.out.println("Enter the Lastname");
			lname = sc.next();
			System.out.println("Enter the Mobile");
			mobile = sc.next();
			System.out.println("Enter the Email");
			email = sc.next();
			System.out.println("Enter the Address");
			add = sc.next();
			i++;
			Employee e = new Employee(fname,lname,mobile,email,add);
			t.add(e);
		}
		Iterator it = t.iterator();
		Employee emp;
		System.out.println("Employee List:");
		System.out.format("%-15s %-15s %-15s %-30s %-15s\n","Firstname","Lastname","MobileNumber","Email","Address"); 
		while(it.hasNext()){
			emp = (Employee)it.next();
			System.out.format("%-15s %-15s %-15s %-30s %-15s\n",emp.getfname(),emp.getlname(),emp.getmobile(),emp.getemail(),emp.getadd());
		}
		
	}
	
}
class Employee{
	String fname,lname,mobile,email,add;
	public Employee(String fname,String lname,String mobile,String email,String add){
		this.fname = fname;
		this.lname = lname;
		this.mobile = mobile;
		this.email = email;
		this.add = add;
	}
	public String getfname(){
	 	return fname;
	}
	public String getlname(){
	 	return lname;
	}
	public String getmobile(){
	 	return mobile;
	}
	public String getemail(){
	 	return email;
	}
	public String getadd(){
	 	return add;
	}
}
class MyComparator implements Comparator{
	public int compare(Object o1,Object o2){
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		if((e1.getfname().charAt(0))<(e2.getfname().charAt(0)))
			return -1;
		else
			return 1;
	}
}
