package day02;

public class Casting {

	public static void main(String[] args) {
		// Casting is Converting
		// Widdening Casting (Implicite Casting) - Converting lower DT to higher DT
		// Narrowing Casting (Explicite Casting) - Converting higher DT to lower DT
		byte b = 100;
		int i = b;
		System.out.println("Widdening Casting : "+i);
		
		long x = 1000543534224599l;
		int i1 = (int)x;
		System.out.println("Narrowing Casting : "+i1);
		
		double price = 100.4555555;
		int displayPrice = (int)price;
		System.out.println("Price is : "+displayPrice);
		
	}

}
