package org.mapinsertValue;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ClassA {
	public static void main (String[]args) {
		
		Map<Integer,String> m = new LinkedHashMap<>();
		m.put(10, "JAVA");
		m.put(20, "selenium");
		Set<Entry<Integer,String>> set = m.entrySet();
		
		for (Entry<Integer, String> e : set) {
			
			System.out.println(e);
			
		}
		
	}
	

}
