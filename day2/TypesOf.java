package com.day2;

public class TypesOf {
	int a = 10;             //instance or Object Variable
	static int b = 20;      //static or class Variable
	public static void main(String[] args) {
		int a = 30;         //local Variable
		System.out.println(a);
		
		TypesOf n = new TypesOf();
		System.out.println(n.a);
		
		System.out.println(TypesOf.b);

	}

}
