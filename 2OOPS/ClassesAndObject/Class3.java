class Patient{
     String patientName;
	 double height,weight;
	 Patient(String n,double h,double w){
	   this.patientName = n;
	   this.height = h;
	   this.weight = w;
	  }
	 double computeBMI(){
	     double bmi = weight/(height*height);
		 return bmi;
	}
}
public class class3{
	public static void main(String args[]){
      Patient ob = new Patient("Asha",50,30);
	  System.out.println("Bmi of Patient is "+ob.computeBMI());
	}
}