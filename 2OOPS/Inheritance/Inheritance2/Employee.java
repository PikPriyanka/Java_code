
class Employee extends Person{
	
	   double salary;
	   int yer;
	   String insuranceNo;
	  /*Employee(double salary,int yer,String insuranceNo){
		   this.salary = salary;
		   this.yer = yer;
		   this.insuranceNo = insuranceNo;
	   }*/
	   public double getsalary(){
	      return salary; }	
	   public int getyear(){
	      return yer; }	  
	   public String getinsurance(){
	      return insuranceNo; }
	   
	  public void setsalary(double salary){
	     this.salary = salary; }	  
	  public void setyear(int yer){
	     this.yer = yer; }
	  public void setinsurance(String insuranceNo){
	     this.insuranceNo = insuranceNo; }
}