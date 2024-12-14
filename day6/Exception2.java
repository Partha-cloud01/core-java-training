package com.day6;

public class Exception2 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		
		try {
			int a [] = new int[-1];
		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("A");
//		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("B");
//		}
//		catch(NumberFormatException e)
//		{
//			System.out.println("C");
//		}
		
//		catch(NegativeArraySizeException e)
//		{
//			System.out.println("A");
//		}
//		
//		catch(ArithmeticException e)
//		{
//			System.out.println("B");
//		}
//		catch(Exception e)
//		{
//			System.out.println("C");
//		}
		finally
		{
			System.out.println("AB");
		} 
		
		System.out.println("After Excetion");
	}

}
