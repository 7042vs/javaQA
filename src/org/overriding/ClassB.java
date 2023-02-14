	 	package org.overriding;

public class ClassB extends ClassA{
	
	@Override
	public void clientName() {
System.out.println("dell");
		super.clientName();
	}
	
	public static void main(String[] args) {
		
		ClassB b = new ClassB();
		b.clientName();
		
	}

}
