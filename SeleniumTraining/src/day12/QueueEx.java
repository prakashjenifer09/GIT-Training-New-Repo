package day12;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		//Queue<String> oQueue = new LinkedList<String>();
		Queue<String> oQueue = new PriorityQueue<String>();
		oQueue.add("Jega");
		oQueue.add("Selvin");
		oQueue.add("Kalpana");
		oQueue.add("Monisha");
		oQueue.add("Santhosh");
		oQueue.add("Jega");
		oQueue.add(null);
		System.out.println(oQueue);
		System.out.println("Head Element : "+oQueue.element());
		System.out.println("Head Peek : "+oQueue.peek());
		System.out.println(oQueue);
		System.out.println("Pool Element : "+oQueue.poll());
		System.out.println(oQueue);
		System.out.println("Remove Element : "+oQueue.remove());
		System.out.println(oQueue);
	}

}
