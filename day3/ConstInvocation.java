package com.day3;

class A {

	A() {
		System.out.println("A");
	}

}

class B extends A {
	B() {
		this("a");
		System.out.println("B");
	}
	B(int a)
	{
		System.out.println("B1");
	}
	B(String name)
	{
		this(5);
		System.out.println("Partha");
	}
}

public class ConstInvocation {

	public static void main(String[] args) {

		B b = new B();

	}

}
