package Assignments;

public class stringassesment {
	
	public static void main(String[] args) {
		
		String S = "Java Exercises";
		String S1 = "Exercises";
		String S3 = "Nisha Prakash";
		System.out.println("Original String = "+ S);
		System.out.println(" ");
		
		System.out.println("Character Position at 0 is = "+ S.charAt(0));
		System.out.println("Character Position at 10 is = "+ S.charAt(10));
		System.out.println(" ");
		
		System.out.println("Contains java? = "+ S.contains("java"));
		System.out.println("Contains Java? = "+ S.contains("Java"));
		System.out.println("Contains Ex? = "+ S.contains("Ex"));
		System.out.println(" ");
		
		System.out.println("Ends with Exercises? = "+ S.endsWith("Exercises"));
		System.out.println("Ends with S1 Content? = "+ S.endsWith(S1));
		System.out.println(" ");
		
		System.out.println("Length of S = "+ S.length());
		System.out.println("Length of S1 = "+ S1.length());
		System.out.println(" ");
		
		int count =0;
		for (int i=0; i<S3.length();i++)
		{
			char S4 = S3.charAt(i);
			if (S4 == 'a')
		    count++;
			
		}
		
		System.out.println("Number of 'a's in my name is:"+ count);
		
	}

}
