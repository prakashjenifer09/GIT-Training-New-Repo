package day04;

public class OneDimensionArray {

	public static void main(String[] args) {
		int a[] = {20,30,40,50};
		int []b = {20,30,40,50,60,70,80,10,20};
		int[] c= {20,30,40,50,60};
		int [] d = {20,30,40,50,60};
		String s[] = new String[6];
		s[0] = "Karthik";
		s[1] = "Jeni";
		s[2] = "Arthi";
		s[3] = "Nivedha";
		s[4] = "Gopal";
		s[5] = "Saran";
		System.out.println(a[3]);
		System.out.println("Size of an array is : "+b.length);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		System.out.println("=====For Each=====");
		for(String value:s) {
			System.out.println(value);
		}
		System.out.println("=====For Each=====");
		for(int val:d) {
			System.out.println(val);
		}
	}

}
