package day10;

public class SBI extends Credo implements RBI,MutiRBI {

	public static void main(String[] args) {
		SBI oSBI = new SBI();
		System.out.println("Home Loan % is : "+oSBI.homeLoanPercentage());
		System.out.println("Car Loan % is : "+oSBI.carLoanPercentage());
		System.out.println("Personl Loan % is : "+oSBI.personalLoanPercentage());
		System.out.println("Credit Card Loan % is : "+oSBI.creditLoanPercentage());
		oSBI.sbiMutualFund();
		oSBI.defaultMethod(); 
		oSBI.dummy();
		
		RBI oRBI = new SBI();
		System.out.println("Home Loan % is : "+oRBI.homeLoanPercentage());
		System.out.println("Car Loan % is : "+oRBI.carLoanPercentage());
		System.out.println("Personl Loan % is : "+oRBI.personalLoanPercentage());
		System.out.println("Credit Card Loan % is : "+oRBI.creditLoanPercentage());
		oRBI.defaultMethod();
		oRBI.dummy();
	}
	
	public void dummy() {
		System.out.println("Multiple Inhertance!!!");
	}

	@Override
	public double homeLoanPercentage() {
		return 6.5;
	}

	@Override
	public double personalLoanPercentage() {
		// TODO Auto-generated method stub
		return 8.9;
	}

	@Override
	public double carLoanPercentage() {
		// TODO Auto-generated method stub
		return 7.5;
	}

	@Override
	public double creditLoanPercentage() {
		return 9.9;
	}

	public void sbiMutualFund() {
		System.out.println("This is SBI Mutual Fund!!!");
	}
	
	public void defaultMethod() {
		System.out.println("Default Method Override in SBI !!!!");
	}
	
	
}
