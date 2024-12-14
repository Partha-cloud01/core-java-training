package com.day6;

public class ThrowKeyword {

	public static void main(String[] args) {
		try 
		{
			//int a = 10 / 0;
			throw new ArithmeticException("Cannot divide by 0");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			//System.out.println("Please enter a valid no");
		}

	}

}
