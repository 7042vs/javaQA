package org.exceptionHandle;

public class ClassA {
	public static void main(String[] args) {
		System.out.println(4%2);
	try {
		System.out.println(4%0);
	} catch (Exception e) {
	
		System.out.println("Dont diride by Zero");
		

	
	}
	
	finally {
		System.out.println("End");
	}
	
	}

}
