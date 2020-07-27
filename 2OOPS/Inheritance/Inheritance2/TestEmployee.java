public class TestEmployee {
	public static void main(String args[]){
		Person ob1 = new Person();
		ob1.setname("Rohini");
		ob1.setage(21);
		ob1.setcont_no("99080898990");
		
		Employee ob2 = new Employee();		
		ob2.setsalary(456700);
		ob2.setyear(1);
		ob2.setinsurance("123");
		
		
		System.out.println("Person Details :");
		System.out.println("Name:: "+ob1.getname() +", Age:: "+ob1.getage()+", Contact no:: "+ob1.getContactno());
		System.out.println("Employee Details :");
		System.out.println("Salary:: "+ob2.getsalary()+", Year Of Work: "+ob2.getyear()+", Insurance no: "+ob2.getinsurance());
     }
}