package com.day6;

public class Finally {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		
		try {
			int a [] = new int[-1];
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("A");
		}
		finally
		{
			System.out.println("AB");
		} 
		
		System.out.println("After Excetion");

	}

}
