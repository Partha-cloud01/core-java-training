package com.day3;

class Vehicle       //parent class
{
	void noEngine()
	{
		System.out.println("I have one Engine");
	}
}
//single Inheritance
class TwoWheeler extends Vehicle     
{
	void noOfWheels()
	{
		System.out.println("I Have two wheels");
	}
}
//Multilevel Inheritance
class Bike extends TwoWheeler
{
	void brandName()
	{
	System.out.println("Bike Brand Name :Ducati");
	}
}
//Hierarchical Inheritance
class ThreeWheeler extends Vehicle
{
	void noOfWheels()
	{
		System.out.println("I Have three wheels");
	}
}
class Auto extends ThreeWheeler
{
	void brandName()
	{
	System.out.println("Auto Brand Name :Atul");
	}
}
public class SingleInherit {

	public static void main(String[] args) {
		
		Bike b1 = new Bike();
		b1.brandName();
		b1.noEngine();
		b1.noOfWheels();
	}

}
