package day15;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finallyBlock();
	}
	
	
	public static void finallyBlock() {
		int i=10;
		try {
			System.out.println(i/0);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Arithmetic Exception!!!");
		}finally {
			System.out.println("Close all the DB connection!!!!");
		}
		System.out.println("***********Rest of the code*********");
	}

}
