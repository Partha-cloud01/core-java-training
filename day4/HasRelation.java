package com.day4;

class Vehicle {

	void function() {
		System.out.println("vehicles run on diesel, petrol and electricity");
	}

}

class Car extends Vehicle {
	Wheel wheel = null;

	Car(Wheel wheel) {
		this.wheel = wheel;
	}

	void carFunctions() {

		wheel.wheelFunction();
	}
}

class Wheel {
	void wheelFunction() {
		System.out.println("Need 4 wheels to drive a Car");
	}
}

public class HasRelation {

	public static void main(String[] args) {
		Wheel wheel = new Wheel();
		Car car = new Car(wheel);
		car.carFunctions();

	}

}
