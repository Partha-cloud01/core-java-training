package com.day2;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		int count = 0;
		System.out.println("Enter the size of array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		//
		System.out.println("Enter elements of array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//duplicate elements
		
		for (int i = 0; i <n; i++) {
			for (int j = i+1; j < n; j++) {
				if (arr[i] == arr[j] && arr[i]!=-1 && arr[j]!=-1) {
					arr[j]=-1;
				    count++;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}
