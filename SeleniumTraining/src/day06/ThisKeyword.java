package day06;

public class ThisKeyword {
	
	int iRollNo;
	String sName;
	
	public ThisKeyword(int iRollNo,String sName) {
		this.iRollNo = iRollNo;
		this.sName = sName;
		}

	public void print() {
		System.out.println("Roll No is : "+iRollNo+" Name is : "+sName);
	}
	
	public void callPrint() {
		print(); //this.print();
		System.out.println("This Keyword : "+this);
		callByObject(this);
	}
	
	public void callByObject(ThisKeyword object) {
		print(); //this.print();
	}
	
	public ThisKeyword returnToSameClass() {
		return this;
	}
	
	
	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword(100,"Karthik");
		//obj.print();
		obj.callPrint();
		System.out.println("Object Ref : "+obj);
		//obj.callByObject(obj);
		//obj.returnToSameClass().callPrint();
	}

}
