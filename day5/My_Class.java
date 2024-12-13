package com.day5;
abstract class Vehicle
{
	void noOfEngine()
	{
		System.out.println("Vehicle has one Engine");
	}
	abstract void noOfWheels();
	abstract void brandName();
}

class Bike extends Vehicle
{

	@Override
	void noOfWheels() {
		System.out.println("Bike has 2 wheels");
		
	}

	@Override
	void brandName() {
		System.out.println("The brand name is : BMW");
		
	}
	
}

class Car extends Vehicle
{

	@Override
	void noOfWheels() {
		System.out.println("Car has 4 wheels");
		
	}

	@Override
	void brandName() {
		System.out.println("The brand name is : Range Rover");
		
	}
	@Override
	void noOfEngine()
	{
		System.out.println("Quadra Liquid cooled Engine");
	}
}

public class My_Class {

	public static void main(String[] args) {
		Vehicle vehicle;
		Bike bike = new Bike();
		vehicle = bike;
		vehicle.noOfEngine();
		vehicle.brandName();
		vehicle.noOfWheels();
		System.out.println();
		vehicle = new Car();
		vehicle.noOfEngine();
		vehicle.brandName();
		vehicle.noOfWheels();
		
	}

}
