class Person{
	String name;
	String dateOfBirth;
	public void meth1(String n ,String dob){
		name = n;
		dateOfBirth = dob;
	    System.out.println("Name "+n+"\ndateOfBirth: "+dateOfBirth);}
}
class Teacher extends Person{
     double salary;
	 String teaches;
}
class Student extends Person{
	int StudentId;
}
class CollegeStudent extends Student{
	String collegenam;
	String year;
	public void meth2(String c,String y){
		this.StudentId = 213;
		collegenam = c;
		year = y;
	    System.out.println("College Name "+collegenam+"\nYear: "+y+"\nStudent id: "+StudentId);}
}
public class Inheritance3{
	public static void main(String args[]){
    Person ob1 = new Person(); 
	ob1.meth1("Priyanka","01-June-1997");
	Teacher ob2 = new Teacher();
	Student ob3 = new Student();
	CollegeStudent ob4 = new CollegeStudent();
	ob4.meth2("TIG College","4th");
	}
}
	