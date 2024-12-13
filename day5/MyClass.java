package com.day5;

abstract class MyAbstract
{
	abstract void method();
	abstract void method1();
	
	void myNormalMethod()
	{
		System.out.println("My Normal method / concrete method");
	}
}
class Normal extends MyAbstract
{

	@Override
	void method() {
		System.out.println("My abstract method");
		
	}

	@Override
	void method1() {
		System.out.println("My abstract method 1");
		
	}
	
}
class MyClass {

	public static void main(String[] args) {
		MyAbstract obj = new Normal();
		obj.myNormalMethod();
		obj.method();
		obj.method1();
		
	}

}
