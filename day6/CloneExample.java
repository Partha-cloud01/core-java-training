package com.day6;

// java - Object cloning
public class CloneExample implements Cloneable {
	
	int a = 10;               //Cloneable and Serializable are  Marker Interface.
	                          // With no abstract methods in Interface(empty Interface).

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneExample obj1 = new CloneExample();
		CloneExample obj2 = (CloneExample) obj1.clone();
		
		obj1.a = 20 ;
		
		System.out.println(obj2.a);
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

}
