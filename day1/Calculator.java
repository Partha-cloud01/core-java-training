package com.day1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Enter the two number");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		float a = sc.nextFloat();
		System.out.println("Enter the second number");
		float b = sc.nextFloat();
		String text = "";
		do {
			System.out.println();
			System.out.println("1:Addition");
			System.out.println("2:Subtraction");
			System.out.println("3:Multiplication");
			System.out.println("4:Division");
			System.out.println("5:Exit");

			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				float c = a + b;
				System.out.println("Addition of two no. :" + c);
				break;
			case 2:
				c = a - b;
				System.out.println("Substraction of two no. :" + c);
				break;
			case 3:
				c = a * b;
				System.out.println("Addition of two no. :" + c);
				break;
			case 4:
				c = a / b;
				System.out.println("Addition of two no. :" + c);
				break;
			case 5:
				System.out.println("Exit");
				System.exit(0);
			default:
				System.out.println("Please enter valid input!!");
			}
			System.out.println("Do you want continue [yes/no]");
			text = sc.next();

		} while (text.equalsIgnoreCase("yes"));
	}

}
