package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {
		Map<String,Integer> credo = new HashMap<String, Integer>();
		credo.put("Selenium-Java", 12000);
		credo.put("Selenium-Python", 14000);
		credo.put("Selenium-C#", 14000);
		credo.put("Java", 8000);
		credo.put("Python", 9000);
		credo.put("API Automation", 10000);
		credo.put("Appium", 11000);
		credo.put("Java", 6000);
		System.out.println(credo);
		System.out.println("Retrive value based on key : "+credo.get("Java"));
		Set<String> key = credo.keySet();
		for (String keyValue : key) {
			System.out.println(keyValue+"-----"+credo.get(keyValue));
		}
		System.out.println("======EntrySet======");
		Set<Entry<String, Integer>> entrySet = credo.entrySet();
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		List<String> oDev = new ArrayList<String>();
		oDev.add("Java");
		oDev.add("C#");
		oDev.add("Python");
		oDev.add("Ruby");
		oDev.add("JS");
		oDev.add("Angular");
		oDev.add("SpringBoot");
		
		List<String> oTest = new ArrayList<String>();
		oTest.add("Selenium-Java");
		oTest.add("Selenium-C#");
		oTest.add("Selenium-Python");
		oTest.add("API Automation");
		oTest.add("Postman");
		oTest.add("Appium");
		oTest.add("Jmeter");
		
		Map<String, List<String>> oMap = new HashMap<String, List<String>>();
		oMap.put("Testing Course", oTest);
		oMap.put("Dev Course", oDev);
		
		System.out.println(oMap);
		System.out.println("Development Course List : "+oMap.get("Dev Course"));
		System.out.println("Development JS Course : "+oMap.get("Dev Course").get(4));
		Set<String> keySet = oMap.keySet();
		for (String keyMap : keySet) {
			System.out.println("========="+keyMap+"=========");
			for(int i=0;i<oMap.get(keyMap).size();i++) {
				System.out.println(oMap.get(keyMap).get(i));
			}
		}
		System.out.println("======Linked HashMap=========");
		Map<String,Integer> oMap1 = new LinkedHashMap<String, Integer>();
		oMap1.put("Selenium-Java", 12000);
		oMap1.put("Selenium-Python", 14000);
		oMap1.put("Selenium-C#", 14000);
		oMap1.put("Java", 8000);
		oMap1.put("Python", 9000);
		oMap1.put("API Automation", 10000);
		oMap1.put("Appium", 11000);
		oMap1.put("Java", 6000);
		System.out.println(oMap1);
		
		System.out.println("======Tree Map=========");
		Map<String,Integer> oMap2 = new TreeMap<String, Integer>();
		oMap2.put("Selenium-Java", 12000);
		oMap2.put("Selenium-Python", 14000);
		oMap2.put("Selenium-C#", 14000);
		oMap2.put("Java", 8000);
		oMap2.put("Python", 9000);
		oMap2.put("API Automation", 10000);
		oMap2.put("Appium", 11000);
		oMap2.put("Java", 6000);
		System.out.println(oMap2);
	}

}
