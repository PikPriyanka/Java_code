abstract class GeneralBank{
     abstract double  getSavingsInterestRate();
     abstract double  getFixedDepositInterestRate();
}
class ICICIBank extends GeneralBank{
	double savingint =4,fixedint=8.5;
	double getSavingsInterestRate(){
	      return savingint;
	}
    double getFixedDepositInterestRate (){
          return fixedint;
	}
}
class KotMBank extends GeneralBank{
	double savingint =6,fixedint=9;
	double getSavingsInterestRate(){
	      return savingint;
	}
    double  getFixedDepositInterestRate (){
          return fixedint;
    }
}
public class Abs1{
	public static void main(String args[]){
		 ICICIBank i=new ICICIBank();
		 System.out.println("ICICIBank has Saving "+i.getSavingsInterestRate()+" and Deposit intrest rate "+i.getFixedDepositInterestRate());
         KotMBank k=new KotMBank();
		 System.out.println("KotMBank has Saving "+k.getSavingsInterestRate()+" and Deposit intrest rate "+k.getFixedDepositInterestRate());
         GeneralBank g=new KotMBank();
		 System.out.println("object of making GeneralBank :");
		  System.out.println("KotMBank has Saving "+g.getSavingsInterestRate()+" and Deposit intrest rate "+g.getFixedDepositInterestRate());     
         GeneralBank g1=new ICICIBank();
		  System.out.println("ICICIBank has Saving "+g1.getSavingsInterestRate()+" and Deposit intrest rate "+g1.getFixedDepositInterestRate());
        

	}
}