package day11;

import java.util.ArrayList;
import java.util.List;

public class Generic_Ex {

	public static void main(String[] args) {
		List oList = new ArrayList();
		oList.add(100);
		oList.add("Nivetha");
		oList.add(10.55);
		oList.add(true);
		System.out.println(oList);
		System.out.println(oList.get(1));
		//String s = (String)oList.get(0);
		//System.out.println(s);
		
		List<String> oName = new ArrayList<String>();
		oName.add("Nisha");
		oName.add("Karthi");
		oName.add("Arthi");
		System.out.println(oName);
		
	}

}
