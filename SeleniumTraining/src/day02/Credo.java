package day02;

public class Credo {

	String name = "Credo Systemz";
	String branch = "Velachery";
	
	public void javaCourseDetails() {
		int duration = 1;
		int fees = 8000;
		System.out.println("Java Duration is : "+duration);
		System.out.println("Java Fees is : "+fees);
	}
	
	public void apiAutomationCourseDetails() {
		int duration = 1;
		int fees = 9000;
		System.out.println("Java Duration is : "+duration);
		System.out.println("Java Fees is : "+fees);
	}
	

	public static void main(String[] args) {
		Credo vela = new Credo(); // Creating an Object
		System.out.println("Institute Name is : "+vela.name);
		System.out.println("Branch is : "+vela.branch);
		vela.javaCourseDetails();
		vela.apiAutomationCourseDetails();
	}
	
}
