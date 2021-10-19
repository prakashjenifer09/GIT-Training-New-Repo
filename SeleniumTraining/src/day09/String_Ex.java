package day09;

public class String_Ex {

	public static void main(String[] args) {
		String s1 = "MATHAN";
		String s2 = "mathan";
		String s3 = "Vijay";
		String s4 = "Mathan";
		StringBuffer s5 = new StringBuffer("Mathan");
		s5.append(" Chandrasekaran");
		System.out.println("String Buffer value is : "+s5);
		
		//s1 = "Arthi";
		
		System.out.println("Equal Method : "+s1.equals(s2));
		System.out.println("Equal Method : "+s1.equals(s3));
		System.out.println("Equal Method : "+s1.equals(s4));
		
		System.out.println("EqualsIgnoreCase Method : "+s1.equalsIgnoreCase((s2)));
		
		System.out.println("Equal Operator : "+(s1==s2));
		System.out.println("Equal Operator : "+(s1==s4));
		
		System.out.println("Contact Method : "+s1.concat(" Chandrasekaran"));
		System.out.println("S1 Value is : "+s1);
		
		System.out.println("Compare Method : "+s1.compareTo(s2)); // -32
		System.out.println("Compare Method : "+s1.compareTo(s4));
		System.out.println("Compare Method : "+s1.compareToIgnoreCase((s2)));
		
		System.out.println("Contains Method : "+s1.contains("than"));
		System.out.println("To Lowercase : "+s1.toLowerCase());
		System.out.println("To UpperCase : "+s2.toUpperCase());
		
		System.out.println("Length Method : "+s1.length());
		System.out.println("Char At Method : "+s1.charAt(3));
		System.out.println("Starts With : "+s1.startsWith("m"));
		System.out.println("Ends With : "+s2.endsWith("n"));
		System.out.println("Starts With : "+s2.startsWith("m",2));
		
		System.out.println("Trim Method : "+s1.trim());
		System.out.println("SubString Method : "+s1.substring(2));
		System.out.println("SubString Method : "+s1.substring(2,5));
		System.out.println("SubString Method : "+s1.substring(0,1));
		
		String course = "This is a Java Training";
		String sPrice = "IPhone Price is 250$";
		System.out.println("Replace Char Method : "+s1.replace('A','a'));
		System.out.println("Replace String Method : "+course.replace("Java", "Selenium"));
		System.out.println("Replace String with RegEx : "+sPrice.replaceAll("[a-zA-Z$]", "").trim());
		System.out.println("Replace String with RegEx : "+sPrice.replaceAll("[0-9]","").trim());
		System.out.println("Replace String with RegEx : "+sPrice.replaceAll("[^0-9]","").trim());
		
		sPrice = sPrice.replaceAll("[^0-9]","").trim();
		System.out.println("Price Value is : "+sPrice);
		int iPrice = Integer.parseInt(sPrice);
		if(iPrice == 250) {
			System.out.println("Testing Validation Passed");
		}
		
		String sDate = "09/25/2021";
		String[] split = sDate.split("/");
		System.out.println(split[1]);
		
		String sName = "Mathan";
		String[] split2 = sName.split("");
		for (String s : split2) {
			System.out.println(s);
		}
		
	}


}