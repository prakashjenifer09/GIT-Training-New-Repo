package day03;

public class ForLoop {

	public static void main(String[] args) {
		ForLoop obj = new ForLoop();
		//obj.forLoop();
		//obj.whileLoop();
		obj.doWhileLoop();
	}
	
	public void forLoop() {
		for(int i=0;i<10;i++) {
			
			if(i==7) {
				System.out.println("I value is 7");
				continue;
			}
			System.out.println(i);
		}
	}
	
	public void whileLoop() {
		int i=1;
		boolean result=true;
		while(result) {
			System.out.println(i);
			i++;
			if(i==10) {
				//result=false;
				break;
			}
		}
		
	}
	
	public void doWhileLoop() {
		int i=10;
		do {
			System.out.println(i);
			i++;
		} while (i<5);
		
	}

}
