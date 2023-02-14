package org.overloding;

public class ClassA {
	public void empId(int emp,String empName,float empNum,long empSalary,double empLong) {

		System.out.println("myid"+emp);
		System.out.println("myname"+empName);
		System.out.println("my number"+empNum);
		System.out.println("my salary"+empSalary);
		
		
	}
	
	public static void main(String[] args) {
		
		ClassA a = new ClassA();
		a.empId(123, "vinish", 897655.8f, 987654325l,23456780987d);
		
	}

}
