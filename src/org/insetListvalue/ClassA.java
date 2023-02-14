package org.insetListvalue;

import java.util.LinkedList;
import java.util.List;

public class ClassA {

	public static void main(String[]args) {
		
		List li = new LinkedList();
		
		li.add(10);
		li.add("java");
		
		for (int i = 0; i < li.size(); i++) {
	        Object object = li.get(i);
	        System.out.println(object);
			
		}
		
	}

}
