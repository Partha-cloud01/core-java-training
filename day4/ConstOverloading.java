package com.day4;

class Const
{
	Const(int a)
	{
		System.out.println("Factorial of the number:" + a *a);
	}
	Const(int a ,int b)
	{
		System.out.println("Adition of two number:" + (a+b));
	}
	Const(String a)
	{
		System.out.println("Welcome All");
	}
	Const(float a , float b)
	{
		System.out.println("float" + (a-b));
	}
}

public class ConstOverloading {

	public static void main(String[] args) {
		Const class3 = new Const("partha");
		Const class1 = new Const(3);
		Const class2 = new Const(3 , 4);
		Const class4 = new Const(21.0f, 19.0f);
	}

}
