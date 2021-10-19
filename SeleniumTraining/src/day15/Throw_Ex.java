package day15;

public class Throw_Ex {

	public static void main(String[] args) throws Exception {
		//interviewSelectionProcess(60);
		votterIllegible(17);
		
	}
	
	public static void interviewSelectionProcess(int avg) {
		if(avg<65) {
			throw new ArithmeticException("Candidate is having lessthan expected avg, So not illegible for Interview!!!");
		}else {
			System.out.println("Candidate is goood for next level!!!");
		}
	}
	
	public static void votterIllegible(int age) throws MathanException  {
		if(age < 18) {
			throw new MathanException("Age is not illegible for voting!!!");
		}else {
			System.out.println("Illegiblle for Voting!!!");
		}
	}

}
