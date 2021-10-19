package day04;

public class MultiDimensionArray {

	public static void main(String[] args) {
		int a[][] = {{10,20,30},{40,50},{70,80,90}};
		//System.out.println(a[2][0]);
		//a.length - It will represent Row Count
		//a[i].length - It will represent the column count from that Row
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+"	");
			}
			System.out.println();
		}
	}

}
