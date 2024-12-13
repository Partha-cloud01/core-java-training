package com.day5;

interface MyInterface1 {
	void myMethod(); // public and abstract
}

interface MyInterface2 {
	void myMethod1();
}

class NormalClass1 implements MyInterface1, MyInterface2 {

	@Override
	public void myMethod() {
		System.out.println("My Abstract method");

	}

	@Override
	public void myMethod1() {
		System.out.println("My Abstract method1");

	}

}

public class MulInterface {

	public static void main(String[] args) {

		NormalClass1 normal = new NormalClass1();
		normal.myMethod();
		normal.myMethod1();
	}

}
