package com.day6;

import java.util.Scanner;
class Age extends Exception
{
	@Override
	public String toString()
	{
		return "Invalid Age";
		
	}
	
}
public class AgeException {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age");
		int n = sc.nextInt();
		int age = n;
		if (age>=18)
		{
			System.out.println("Welcome to vote!!");
		}
		else
		{
			try {
				throw new Age();
			}
			catch(Age e)
			{
				System.out.println(e);
			}
		}
	}

}
