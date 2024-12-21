package com.day12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExp {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9);
		//-function definition\
		//:: referencing println method
		//forEach() termination operation
		
		//termination operations
		number.stream().filter(x -> x % 2 == 0).forEach(System.out::println);//using filter function.
		
		long count = number.stream().filter(x -> x % 2 == 0).count(); //using count function to count after filter function.
		System.out.println(count);
		//using collect method after filtering and displaying in Print Statement.
		List<Integer> evenNumber = number.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumber);
		
		//after filter adding one more intermediate function
		//perform MAP()
		List<Integer> even = number.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10)
				.sorted()
				.collect(Collectors.toList());
		System.out.println(even);
	}

}
