package day12;

public class EnumClass {
	
	public static void enumValue() {
		System.out.println(BrowserTypes.CHROME);
		BrowserTypes[] values = BrowserTypes.values();
		for (BrowserTypes browserTypes : values) {
			System.out.println(browserTypes);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enumValue();
	}

}
