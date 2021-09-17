package Assignments;

public class arrayhasspecificvalue {

	public static void main(String[] args)
	{
		int a[]= {10,20,30,40,50};
				
	       System.out.println("Find the value 30");
			for (int i=0;i<a.length;i++) 
			{
		     if (a[i]==30)		     
		     System.out.println(a[i]+ "- Match Found");
		     else
		     System.out.println(a[i]+  "- Match not found");
		      
			}	
		

	}

}
