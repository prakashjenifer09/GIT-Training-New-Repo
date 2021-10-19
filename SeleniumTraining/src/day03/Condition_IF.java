package day03;

public class Condition_IF {

	public static void main(String[] args) {
		Condition_IF obj = new Condition_IF();
		//obj.ifCondition();
		obj.switchCase();
	}
	
	public void ifCondition() {
		int mark = 80;
		// IF Condition
		if(mark<35) {
			System.out.println("Student Failed!!!");
		}
		// IF-Else
		if(mark<35) {
			System.out.println("Student Failed!!!");
		}else {
			System.out.println("Student Passed!!!");
		}
		// If-Else If-Else
		if(mark<35) {
			System.out.println("Student Failed!!!");
		}else if(mark > 34 && mark < 60){
			System.out.println("Student is Passed with avg marks!!!");
		}else if(mark > 59 && mark < 80) {
			System.out.println("Student is Passed with good marks!!!");
		}else {
			System.out.println("Student is Passed with distincsion marks!!!");
		}
	}
	
	public void switchCase() {
		String browser = "Chrome";//Chrome,FF,IE,Edge,Safari
		switch (browser) {
		case "Chrome":
			System.out.println("Invoke Chrome Browser!!!");
			break;
		case "FF":
			System.out.println("Invoke FF Browser!!!");
			break;
		case "IE":
			System.out.println("Invoke IE Browser!!!");
			break;
		case "Edge":
			System.out.println("Invoke Edge Browser!!!");
			break;

		default:
			System.out.println("User input is wrong");
			break;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
