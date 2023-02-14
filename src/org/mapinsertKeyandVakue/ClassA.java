package org.mapinsertKeyandVakue;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ClassA {

	
	
	public static void main(String[] args) {
		
		Map<Integer, String> m =new LinkedHashMap<>();
		m.put(10, "Java");
		m.put(20, "Selenium");
		Set<Entry<Integer,String>> set = m.entrySet();
		for (Entry<Integer, String> e : set) {
			
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		
		
		
		
		
	}
}
