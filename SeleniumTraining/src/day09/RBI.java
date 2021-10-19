package day09;

public abstract class RBI {
	
	String branch = "Parrys";
	
	public RBI() {
		System.out.println("RBI Default Constructor!!!");
	}
	
	public double homeLoanPercentage() {
		return 6.8;
	}
	
	public double personalLoanPercentage() {
		return 9.0;
	}
	
	public double carLoanPercentage() {
		return 7.5;
	}
	
	public abstract double creditLoanPercentage();

}
