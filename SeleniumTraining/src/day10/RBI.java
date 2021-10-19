package day10;

public interface RBI {
	
	int iRollNo = 100;
	
	public double homeLoanPercentage();
	
	public double personalLoanPercentage();
	
	public double carLoanPercentage();
	
	public abstract double creditLoanPercentage();
	 
	public void dummy();
	
	public default void defaultMethod() {
		System.out.println("Default Method!!!!");
	}

	

}
