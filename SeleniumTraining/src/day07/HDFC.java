package day07;

public class HDFC extends RBI{
	
	int iHDFC = 2020;
	String sHDFCBranch = "Besant Nagar";
	
	public HDFC() {
		super(100);
		System.out.println("HDFC Default Constructor!!!");
	}
	
	public void print() {
		System.out.println("HDFC ID is  : "+iHDFC);
		System.out.println("Branch is : "+sHDFCBranch);
		//super.display();
	}
	
	public void display() {
		System.out.println("Method Overridding!!!");
	} 

	public static void main(String[] args) {
		HDFC oHDFC = new HDFC();
		oHDFC.print();
		oHDFC.display(); // Compile Time Polymorphism
		
		RBI oRef = new HDFC();
		oRef.dummy();
		oRef.display();
	}

}
