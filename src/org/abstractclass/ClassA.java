package org.abstractclass;

public class ClassA extends Abstract {

	public void test() {

		System.out.println("Abstract Class");
	}
	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.test();
		a.hi();
		
	}
}
