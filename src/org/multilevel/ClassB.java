package org.multilevel;

public class ClassB extends ClassA {
	
	private void empId() {
     
		System.out.println("id : 123");
	
		
	}
   
	public static void main(String[] args) {
		
		ClassB c = new ClassB();
		
		c.empId();
		c.empMobile();
		c.empName();
		
	}
	
	
}
