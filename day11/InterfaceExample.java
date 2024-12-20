package com.day11;
interface MyInterface1
{
	void abstractMethod();
	default void myDefaultMethod()
	{
		System.out.println("My default method from interface");
	}
	static void myStaticMethod()
	{
		System.out.println("My static method from interface");
	}
}

public class InterfaceExample implements  MyInterface1  {

	public static void main(String[] args) {
		MyInterface1 inter = new InterfaceExample();
		inter.myDefaultMethod();
		MyInterface1.myStaticMethod();

	}

	@Override
	public void abstractMethod() {
		
	}

}
