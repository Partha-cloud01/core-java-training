package com.day5;

abstract class Vehicle2
{
	Vehicle2()
	{
		System.out.println("Abstract class Constructor without Arguments");
	}
	Vehicle2(int a) // default Constructor. called by super.
	{
		this();
		System.out.println("Abstract class Constructor with Arguments");
	}
	void noOfEngine()
	{
		System.out.println("Vehicle has one Engine");
	}
	abstract void noOfWheels();
	abstract void brandName();
}

class Bike1 extends Vehicle2
{
	Bike1() {
		super(5);
	}
	@Override
	void noOfWheels() {
		System.out.println("Bike has 2 wheels");
		
	}

	@Override
	void brandName() {
		System.out.println("The brand name is : BMW");
		
	}
	
}

public class Example3 {

	public static void main(String[] args) {
		Vehicle2 vehicle;
		//Bike1 bike5 = new Bike1();
		vehicle = new Bike1();
		vehicle.noOfEngine();
		vehicle.brandName();
		vehicle.noOfWheels();

	}

}
