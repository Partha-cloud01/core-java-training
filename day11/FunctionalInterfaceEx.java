package com.day11;

/*
//without Lambda expression we will create class and implement method.
class Addtion implements MyInterface
{
	public int calc(int a, int b) {
		return a + b;
	}
}
class Substraction implements MyInterface
{
	public int calc(int a, int b) {
		return a - b;
	}
}
*/
@FunctionalInterface
interface MyInterface
{
	int calc(int a , int b); //it can be public & abstract
}

public class FunctionalInterfaceEx {

	public static void main(String[] args) {
		//using lambda expression we can reduce the lines of code.
		MyInterface ref = (a, b) -> a + b;
		System.out.println(ref.calc(10, 20));
		System.out.println(ref.calc(100, 150));
		
		ref = (a, b) -> a - b;
		System.out.println(ref.calc(10, 20));
		System.out.println(ref.calc(100, 150));
	}

}
