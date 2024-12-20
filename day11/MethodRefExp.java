package com.day11;

@FunctionalInterface
interface MyReference
{
	void showMessage();
}

public class MethodRefExp {
	void myInstaceMethod()
	{
		System.out.println("Example for instance method reference");
	}
	static void myStaticMethod()
	{
		System.out.println("Example for static method reference");
	}
	MethodRefExp(){
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		//reference to a instance method
		MethodRefExp obj = new MethodRefExp();
		MyReference reference = obj::myInstaceMethod;
		reference.showMessage();
		
		//reference to a static method
		reference = MethodRefExp::myStaticMethod;
		reference.showMessage();
		
		//reference for constructor
		reference = MethodRefExp::new;
		reference.showMessage();

	}

}
