package day15;

public class TryCatch {
	

	public static void main(String[] args) {
		//singleTryCatch();
		//singleTryWithDiffCatch();
		//singleTryWithMultiCatch();
		nullPointerException();
	}
	
	public static void singleTryCatch() {
		int a[] = {10,20,30,40,50};
		try {
		for(int i=0;i<=5;i++) {
			System.out.println(a[i]);
		}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("*********Rest of Code*********");
	}
	
	public static void singleTryWithDiffCatch() {
		int a[] = {10,20,30,40,50};
		try {
		for(int i=0;i<=5;i++) {
			System.out.println(a[i]);
		}
		}catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("*********Rest of Code*********");
	}
	
	public static void singleTryWithMultiCatch() {
		int a[] = {10,20,30,40,50};
		int div=3;
		try {
		for(int i=0;i<=5;i++) {
			System.out.println(a[i]);
			System.out.println(a[i]/div);
			div--;
		}
		}catch (ArithmeticException e) {
			System.out.println(e);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("*********Rest of Code*********");
	}
	
	public static void nullPointerException() {
		String s1 = "Mathan";
		System.out.println("Length is : "+s1.length());
		try {		
		s1 = null;
		System.out.println("Length is : "+s1.length());
		}catch (NullPointerException e) {
			System.out.println(e);
			s1 = "Saranya";
		}
		System.out.println("Length is : "+s1.length());
	}
	
	

}
