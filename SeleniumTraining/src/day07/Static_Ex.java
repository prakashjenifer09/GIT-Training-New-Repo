package day07;

public class Static_Ex {
	
	int iRollNo;
	String sName;
	static int iPage = 0;
	static String sBatch = "WeekEnd";
	
	public Static_Ex(int i,String name) {
		iPage++;
		iRollNo = i;
		sName = name;
	}
	
	
	static {
		System.out.println("This is a 1st Static Block!!!");
	}
	
	public void printDetails() {
		System.out.println("Roll No is : "+iRollNo);
		System.out.println("Name is : "+sName);
		System.out.println("Batch is : "+sBatch);
		System.out.println("Page value is : "+iPage);
		staticMethod();
	}
	
	static {
		System.out.println("This is a 2nd Static Block!!!");
	}

	public static void staticMethod() {
		System.out.println("This is a Static User Defined Method!!!");
	}
	
	public static void staticMethod(int i) {
		System.out.println("This is a Static User Defined Method!!!");
	}
	
	public static void main(String[] args) {
		Static_Ex stud1 = new Static_Ex(1,"Arthi");
		stud1.printDetails();
		//static int i;
		
		Static_Ex stud2 = new Static_Ex(2,"Nivetha");
		stud2.printDetails();
		
		Static_Ex stud3 = new Static_Ex(3,"Saranya");
		stud3.printDetails();
		
		Static_Ex stud4 = new Static_Ex(4,"Karthi");
		stud4.printDetails();
		
		staticMethod();
		//Static_Ex.staticMethod();
	}

}
