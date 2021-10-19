package day03;

public class Operators_Ex {

	public static void main(String[] args) {
		// Unary Operators
		int a = 2;
		int b = 2;
		System.out.println("Post Increment : "+(a++));
		System.out.println(a);
		System.out.println("Pre Increment : "+(++b));
		// Logical Operator
		boolean x = true;
		boolean y = false;
		System.out.println("Output of AND Operator is : "+(x&&y));
		System.out.println("Output of OR Operator is : "+(x||y));
		System.out.println("Output of NOT Operator is : "+!(x&&y));
		// Assignment Operator
		int i=10;
		System.out.println("Output is "+(i*=10));
	}

}
