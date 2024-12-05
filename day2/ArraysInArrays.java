package com.day2;

public class ArraysInArrays {

	public static void main(String[] args) {
		int arr[][] = new int[3][];
		arr[0] = new int[] { 1, 2, 3 };
		arr[1] = new int[] { 4, 5, 6, 7 };
		arr[2] = new int[] { 8, 9, 10 };
		for (int i[] : arr) {
			for (int j : i) {
				System.out.print(j +" ");
			}
			System.out.println();
		}

	}

}
