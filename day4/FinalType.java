package com.day4;

public class FinalType {
	final int b = 5;
	
	void display()
	{
		System.out.println("the speed is " + b);
	}

	public static void main(String[] args) {
		final int a = 4;
		
		FinalType fin = new FinalType();
		int c= a+a;
		fin.display();
		System.out.println(c);
		

	}

}
