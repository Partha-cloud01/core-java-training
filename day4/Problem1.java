package com.day4;

class MyClass
{
	void m1(int a)
	{
		System.out.println("Factorial of the number:" + a*a);
	}
	void m1(int a ,int b)
	{
		System.out.println("Adition of two number:" + (a+b));
	}
	void m1(String a)
	{
		System.out.println("Welcome All");
	}
}

public class Problem1 {

	public static void main(String[] args) {
		MyClass myclass = new MyClass();
		myclass.m1(5);
		myclass.m1(4,6);
		myclass.m1("Partha");
	}

}
