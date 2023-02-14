package org.setinsertValue;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class ClassA {
	public static void main(String[]args) {
		Set<Integer> e=  new LinkedHashSet<>();
		e.add(10);
		e.add(20);
		
		for (Integer integer : e) {
			
			System.out.println(integer);
		}
		
	}

}
