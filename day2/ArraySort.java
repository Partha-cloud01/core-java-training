package com.day2;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i : arr)
		{
			System.out.println(i);
		}
		
		for(int i = 0; i < n; i++)
		{
			System.out.println("sorting the arrays elements in ascending: " + arr[i]);;
		}
		System.out.println();
		for(int i = n - 1; i >= 0; i--)
		{
			System.out.println("sorting the arrays elements in descending: " + arr[i]);
		}
		sc.close();
	}

}
