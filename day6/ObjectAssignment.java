package com.day6;

public class ObjectAssignment {
	
	int a = 15;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("object");
	}

	public static void main(String[] args) {
		ObjectAssignment obj1 = new ObjectAssignment();
		ObjectAssignment obj2 = obj1;
		
		obj1.a = 30;
		
		System.out.println(obj2.a);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		obj1 = null;
		obj2 = null;
		System.gc();
		
	}

}
