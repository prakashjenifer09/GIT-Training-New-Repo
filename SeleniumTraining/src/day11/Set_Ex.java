package day11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set_Ex {

	public static void main(String[] args) {
		Set<String> oSet1 = new HashSet<String>();
		oSet1.add("Vijay");
		oSet1.add("Karthi");
		oSet1.add("Gopi");
		oSet1.add(null);
		oSet1.add("Arun");
		oSet1.add("Mathan");
		oSet1.add("Vijay");
		oSet1.add(null);
		System.out.println(oSet1);
		oSet1.add("Nisha");
		oSet1.add("Jone");
		oSet1.add("Arthi");
		System.out.println(oSet1);
		List<String> oName = new ArrayList<String>();
		oName.add("Tommy");
		oName.add("Jimi");
		oName.add("Nimi");
		oSet1.addAll(oName);
		System.out.println(oSet1);
		System.out.println("==========ForEach==========");
		for (String value : oSet1) {
			System.out.println(value);
		}
		System.out.println("===========Iterator===========");
		Iterator<String> it = oSet1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("==========Linked HastSet==========");
		Set<String> oSet2 = new LinkedHashSet<String>();
		oSet2.add("Vijay");
		oSet2.add("Karthi");
		oSet2.add("Gopi");
		oSet2.add(null);
		oSet2.add("Arun");
		oSet2.add("Mathan");
		oSet2.add("Vijay");
		oSet2.add(null);
		System.out.println(oSet2);
		
		System.out.println("==========Tree Set==========");
		Set<String> oSet3 = new TreeSet<String>();
		oSet3.add("Vijay");
		oSet3.add("Karthi");
		oSet3.add("Gopi");
		oSet3.add("Arun");
		oSet3.add("Mathan");
		oSet3.add("Vijay");
		System.out.println(oSet3);
	}

}
