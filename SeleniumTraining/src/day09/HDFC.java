package day09;

public class HDFC extends RBI{

	public static void main(String[] args) {
		//RBI oRBI = new RBI();
		HDFC oHDFC = new HDFC();
		System.out.println("Home Loan % is : "+oHDFC.homeLoanPercentage());
		System.out.println("Car Loan % is : "+oHDFC.carLoanPercentage());
		System.out.println("Personl Loan % is : "+oHDFC.personalLoanPercentage());
		System.out.println("Credit Card Loan % is : "+oHDFC.creditLoanPercentage());
		
		RBI oRef = new HDFC();
		System.out.println("Home Loan % is : "+oRef.homeLoanPercentage());
		System.out.println("Car Loan % is : "+oRef.carLoanPercentage());
		System.out.println("Personl Loan % is : "+oRef.personalLoanPercentage());
		System.out.println("Credit Card Loan % is : "+oRef.creditLoanPercentage());
		
	}

	@Override
	public double creditLoanPercentage() {
		// TODO Auto-generated method stub
		return 0.1;
	}

}
