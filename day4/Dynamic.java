package com.day4;

class DynamicMethod {
	
	void noEngine()
	{
		System.out.println("i have one engine");
	}
	void noWheels()
	{
		System.out.println("I have wheels not defined");
	}
}
class Base extends DynamicMethod
{
	void noWheels()
	{
		System.out.println("I have two wheels");
	}
	
}
public class Dynamic
{
	public static void main(String[] args) {
		DynamicMethod n1 = new Base();
		n1.noEngine();
		n1.noWheels();
	}

}
