package com.day5;

interface VehiclePlan {
	void noOfEngine();

	void noOfWheels();

	void brandName();
}

abstract class Vehicle5 implements VehiclePlan {
	public void noOfEngine() {
		System.out.println("I have 1 engine");
	}
}

class Bike5 extends Vehicle5 {

	@Override
	public void noOfWheels() {
		System.out.println("It has 2 wheels");

	}

	@Override
	public void brandName() {
		System.out.println("The brand Name is :Triump");
	}

}

public class InterfaceExample4 {

	public static void main(String[] args) {
		VehiclePlan vehicle = new Bike5();
		vehicle.noOfEngine();
		vehicle.brandName();
		vehicle.noOfWheels();

	}

}
