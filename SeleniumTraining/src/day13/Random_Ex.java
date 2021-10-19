package day13;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.DoubleStream;

public class Random_Ex {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			//randomMath();
			//randomRandomClass();
			//randomThreadLocal();
			System.out.println("Int Value is : "+generateRandomInt(10, 1000));
			System.out.println("Double Value is : "+generateRandomDouble(1000, 2000));
		}
		
	}
	
	public static void randomMath() {
		double random = Math.random();
		System.out.println("Random Double value between 0.0 to 1.0 : "+random);
	}
	
	public static void randomRandomClass() {
		Random oRan = new Random();
		System.out.println("Random Integer Value : "+oRan.nextInt());
		System.out.println("Random Integer Value from the Range : "+oRan.nextInt(1000));
		System.out.println("Random Double Value : "+oRan.nextDouble());
		System.out.println("Random Boolean Value : "+oRan.nextBoolean());
	}
	
	public static void randomThreadLocal() {
		double nextDouble = ThreadLocalRandom.current().nextDouble();
		System.out.println("Double Random Value is : "+nextDouble);
		double doubleRange = ThreadLocalRandom.current().nextDouble(10, 100);
		System.out.println("Double Range Random Value is : "+doubleRange);
	}
	
	public static int generateRandomInt(int min,int max) {
		Random r = new Random();
		int result = r.nextInt((max-min)+1)+min;
		return result;
	}
	
	public static double generateRandomDouble(int min,int max) {
		double result = Math.random()*((max-min)+1)+min;
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
