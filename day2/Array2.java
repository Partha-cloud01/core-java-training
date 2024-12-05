package com.day2;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		System.out.println("Enter the size of array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int eCount = 0;
		int oCount = 0;
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the inputs");
			arr[i] = sc.nextInt();
			if (arr[i] % 2 == 0) {
				eCount++;
			} else {
				oCount++;
			}
		}
		System.out.println("Count of even No.");
		System.out.println(eCount);
		System.out.println("Count of odd No.");
		System.out.println(oCount);
		
		sc.close();
	}

}
