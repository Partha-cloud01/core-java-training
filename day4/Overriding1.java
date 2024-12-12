package com.day4;
class Override
{
	void noEngine()
	{
		System.out.println("i have one engine");
	}
	void noWheels()
	{
		System.out.println("I have wheels not defined");
	}
}
class MotorCycle extends Override
{
	void noWheels()
	{
		System.out.println("I have two wheels");
	}
}

public class Overriding1 {

	public static void main(String[] args) {
		MotorCycle motorcycle = new MotorCycle();
		motorcycle.noEngine();
		motorcycle.noWheels();
	}

}
