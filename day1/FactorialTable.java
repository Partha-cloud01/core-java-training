package com.day1;

import java.util.Scanner;

public class FactorialTable {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact = 1;
		System.out.println("value    factorial");
		for (int i = 1; i <= num; i++) {
			fact *= i;
		
			System.out.println(i+"         " + fact);
		}

	}

}
