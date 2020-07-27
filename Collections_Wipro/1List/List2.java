import java.util.*;
public class List2{
	public static void main(String[] args){
        EmployeeDB empdb = new EmployeeDB();
		
		Employee e1 = new Employee();
		e1.setEmpId(2015);
		e1.setName("Rajesh Singh");
		e1.setEmail("rajesh7@gmail.com");
		e1.setGender("Male");
		e1.setSalary(650000);
		empdb.addEmployee(e1);
		
		Employee e2 = new Employee();
		e2.setEmpId(1654);
		e2.setName("Heena Kaur");
		e2.setEmail("heena@gmail.com");
		e2.setGender("Female");
		e2.setSalary(600000);
		empdb.addEmployee(e2);
                
        Employee e3 = new Employee();
		e3.setEmpId(1956);
		e3.setName("Mukesh Sharma");
		e3.setEmail("msharma@gmail.com");
		e3.setGender("Male");
		e3.setSalary(700000);
		empdb.addEmployee(e3);
		
		empdb.showPaySlip(195);
        empdb.showPaySlip(1654);
        empdb.deleteEmployee(1956);
        empdb.showPaySlip(1956);
	}
}
class Employee{
	int empId;
	String empName;
	String email;
	String gender;
	float salary;
	
	public void setEmpId(int empId){
		this.empId = empId;
	}
	public void setName(String name){
		empName = name;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public void setSalary(float salary){
		this.salary = salary;
	}
        public int getEmpId(){
            return empId;
        }
        public String getName(){
            return empName;
        }
        public String getEmail(){
            return email;
        }
        public String getGender(){
            return gender;
        }
        public float getSalary(){
            return salary;
        }
            
	void GetEmployeeDetails(){
		System.out.println("Employee Id is "+empId);
		System.out.println("Employee Name is "+empName);
		System.out.println("Employee Email is "+email);
		System.out.println("Employee Gender is "+gender);
		System.out.println("Employee Salary is "+salary);
	}
}
class EmployeeDB{
    ArrayList<Employee> list = new ArrayList<Employee>();
	Iterator i = list.iterator();
	public  boolean addEmployee(Employee e){
		return list.add(e);
	}
	public  boolean deleteEmployee(int empId){
            int j=0;
            int size = list.size();
            while(j<size){
				Employee e = list.get(j);
                if(e.empId == empId){
					list.remove(e);
					System.out.println("Employee with Employee ID "+empId+" deleted");
                 return true;
                }
                j++;
                
            }   System.out.println("Employee with Employee ID "+empId+" not found");
				return false;
	}
	public  String showPaySlip(int empId){
            int j=0;
            int size = list.size();
            while(j<size){
				Employee e = list.get(j);
                if(e.empId == empId){
                   System.out.println("Pay Slip of Employee with Employee ID "+empId+" is :");
					e.GetEmployeeDetails();
                  return "true";
                }
                j++;
                
            }   System.out.println("Payslip method :Employee with Employee ID "+empId+" not found");     
                 return "true";
          }
	
}