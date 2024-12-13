package com.day5;

interface MyInterface3 {
	void myMethod(); // public and abstract
}

interface MyInterface4 extends MyInterface3 {
	void myMethod1();
}

class NormalClass2 implements MyInterface4 {

	@Override
	public void myMethod() {
		System.out.println("My Abstract method");

	}

	@Override
	public void myMethod1() {
		System.out.println("My Abstract method1");

	}

}

public class InterfaceExample2 {

	public static void main(String[] args) {
		
		MyInterface4 inter = new NormalClass2();
		inter.myMethod();
		inter.myMethod1();
	}

}
