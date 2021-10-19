package day08;

public class String_Ex {

	public static void main(String[] args) {
		String s1 = "Mathan";
		String s2 = "mathan";
		String s3 = "Vijay";
		String s4 = "Mathan";
		//s1 = "Arthi";
		
		System.out.println("Equal Method : "+s1.equals(s2));
		System.out.println("Equal Method : "+s1.equals(s3));
		System.out.println("Equal Method : "+s1.equals(s4));
		
		System.out.println("EqualsIgnoreCase Method : "+s1.equalsIgnoreCase((s2)));
		
		System.out.println("Equal Operator : "+(s1==s2));
		System.out.println("Equal Operator : "+(s1==s4));
		
		System.out.println("Contact Method : "+s1.concat(" Chandrasekaran"));
		System.out.println("S1 Value is : "+s1);
	}

}
