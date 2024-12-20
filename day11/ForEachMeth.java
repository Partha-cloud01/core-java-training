package com.day11;

import java.util.Arrays;
import java.util.List;

public class ForEachMeth {
//internally for each method is a functional interface.
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		//after java 8 using for each to print each number
		//we can pass any object
		
		numbers.forEach(number -> System.out.println(number));

	}

}
