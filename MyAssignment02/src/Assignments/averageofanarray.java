package Assignments;

public class averageofanarray {

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50};
		int sum=0;
		int avg=0;
		
	       System.out.println("Average of Numbers in an Array");
			for (int i=0;i<a.length;i++) 
			{
		       sum=sum+a[i];
		       avg=sum/a.length;
		      
			}		
		System.out.println(avg);
	}

}


	
