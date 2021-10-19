package day02;

public class Variables {
	
	int iRollNo = 10;
	String sName = "Credo";
	static String student = "Saranya";

	public static void main(String[] args) {
		int a=10,b=20,c;
		c = a + b;
		System.out.println("Sum of 2 numbers are : "+c);
		
	}
	
	public void print() {
		System.out.println("Roll no is : "+iRollNo);
		System.out.println("Name is : "+sName);
		System.out.println("Student Name is : "+student);
	}

}
