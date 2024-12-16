package com.day7;

public class InnerSample {
	 class Inner1
	 {
		 void display()
		 {
			 System.out.println("Non static inner class");
		 }
	 }
	 static class Inner2
	 {
		 void display()
		 {
			 System.out.println("Static inner class");
		 }
	 }

	public static void main(String[] args) {
		
		//non Static class
		InnerSample obj = new InnerSample();
		Inner1 inner = obj.new Inner1();
		inner.display();
		
		//static class 
		Inner2 inner1 = new InnerSample.Inner2();
		inner1.display();
		
		class Inner3
		{
			void display()
			{
				System.out.println("its a Local Inner class");
			}
		}
		Inner3 obj2 = new Inner3();
		obj2.display();
	}
}
