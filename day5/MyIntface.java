package com.day5;

interface MyInterface
{
	void myMethod();  //public and abstract  
	void myMethod1();
}

class NormalClass implements MyInterface
{

	@Override
	public void myMethod() {
		System.out.println("My Abstract method");
		
	}

	@Override
	public void myMethod1() {
		System.out.println("My Abstract method1");
		
	}
	
} 
public class MyIntface {

	public static void main(String[] args) {
		MyInterface inter = new NormalClass();
		inter.myMethod();
		inter.myMethod1();
	}

}
