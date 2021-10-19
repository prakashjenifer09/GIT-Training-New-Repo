package day06;

public class ThisMethod {
	
	int iRollNo;
	String sName;
	
	public ThisMethod() {
		this(100); 
		System.out.println("This is a default constructor");
	}
		
	public ThisMethod(int iRollNo,String sName) {
		this(); // Constructor Call
		this.iRollNo = iRollNo;
		this.sName = sName;
		}
	
	public ThisMethod(int i) {
		
		System.out.println("I value is : "+i);
	}
	
	public void print() {
		System.out.println("Roll No is : "+iRollNo+" Name is : "+sName);
	}

	public static void main(String[] args) {
//		ThisMethod obj1 = new ThisMethod();
//		obj1.print();
		
		ThisMethod obj2 = new ThisMethod(1010,"Arthi");
		obj2.print();
	}

}
