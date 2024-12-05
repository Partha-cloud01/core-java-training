package com.day2;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		int sum=0;
		System.out.println("Enter the size of array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter the inputs");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("the array elements");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
			sum+=arr[i];
		}
		System.out.println("the sum of the array elements");
		System.out.println(sum);
		System.out.println("length of the Array");
		System.out.println(arr.length);
		sc.close();
	}

}