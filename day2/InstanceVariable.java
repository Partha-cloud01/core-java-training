package com.day2;

public class InstanceVariable {
	int a = 10 ;
	static int b = 20;
	public static void main(String[] args) {
		InstanceVariable obj1 = new InstanceVariable();
		InstanceVariable obj2 = new InstanceVariable();
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		System.out.println();
		System.out.println(obj1.b);
		System.out.println(obj2.b);
		obj1.a = 20;
		obj2.b = 30;
		System.out.println("after Initialisation of the static and Instance variable");
		System.out.println("for Instace Variable");
		System.out.println("Object 1:" + obj1.a);
		System.out.println("Object 2:" + obj2.a);
		System.out.println("for static varaible");
		System.out.println("Object 1:" + obj1.b);
		System.out.println("Object 2:" + obj2.b);
	}

}