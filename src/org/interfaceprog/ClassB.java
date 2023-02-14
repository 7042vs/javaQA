package org.interfaceprog;

public class ClassB implements ClassA {

	@Override
	public void test() {
		System.out.println("is my bike");
		
	}
	
	public static void main(String[] args) {
		
		ClassB b = new ClassB();
		b.test();
		
		
		
	}

}
