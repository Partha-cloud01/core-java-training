package com.day2;

public class MethodCall {

	void myMethod1() {
		System.out.println("Instance Method");
	}

	static void myMethod2() {
		System.out.println("Static Method");
	}

	public static void main(String[] args) {
		MethodCall obj = new MethodCall();

		obj.myMethod1();
		MethodCall.myMethod2();
	}

}
