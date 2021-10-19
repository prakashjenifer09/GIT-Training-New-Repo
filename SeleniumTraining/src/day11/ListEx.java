package day11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		List<String> oList1 = new ArrayList<String>();
		oList1.add("Vijay");
		oList1.add("Karthi");
		oList1.add("Gopi");
		oList1.add(null);
		oList1.add("Arun");
		oList1.add("Mathan");
		oList1.add("Vijay");
		oList1.add(null);
		System.out.println(oList1);
		oList1.add(4, "Baskar");
		System.out.println(oList1);
		List<String> oName = new ArrayList<String>();
		oName.add("Nisha");
		oName.add("Karthi");
		oName.add("Arthi");
		oList1.addAll(6,oName);
		System.out.println(oList1);
		System.out.println("Retrive any value from the List : "+oList1.get(4));
		System.out.println("To get the Size of List : "+oList1.size());
		System.out.println("Contains Method : "+oList1.contains("Mathan"));
		System.out.println("Equal Method : "+oList1.equals(oName));
		System.out.println("Last Index Of : "+oList1.lastIndexOf("Vijay"));
		oName.removeAll(oName);
		System.out.println(oName);
		System.out.println("========For Loop==========");
		for(int i=0;i<oList1.size();i++) {
			System.out.println(oList1.get(i));
		}
		System.out.println("========For Each========");
		for (String value : oList1) {
			System.out.println(value);
		}
		System.out.println("=======While Loop========");
		int i=0;
		while(i<oList1.size()) {
			System.out.println(oList1.get(i));
			i++;
		}
		System.out.println("========Iterator=======");
		Iterator<String> it = oList1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("=======Linked List=========");
		List<String> oList2 = new LinkedList<String>();
		oList2.add("Vijay");
		oList2.add("Karthi");
		oList2.add("Gopi");
		oList2.add(null);
		oList2.add("Arun");
		oList2.add("Mathan");
		oList2.add("Vijay");
		oList2.add(null);
		System.out.println(oList2);
	}

}
