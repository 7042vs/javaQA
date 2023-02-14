package org.mapinsetValue;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ClassA {
	public static void main(String[] args) {
		
		Map<Integer,String> e =new LinkedHashMap<>();
	e.put(10, "java");
		Set<Entry<Integer, String>> set = e.entrySet();
		
		for (Entry<Integer, String> entry : set) {
			
			System.out.println(entry);
		}
		
		
		
		
		
		
	}

}
