package com.day12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}

public class Java8Additional {

	public static void main(String[] args) {
		// 1. Given a list of integers, find out all the even numbers that exist in the
		// list using
		// Stream functions?
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> evenNumber = num.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumber);

		// 2. Given a list of integers, find out all the numbers starting with 1 using
		// Stream functions?
		List<Integer> num1 = Arrays.asList(10, 18, 11, 40, 14, 21, 15);
		List<Integer> oneList = num1.stream().filter(x -> String.valueOf(x).startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(oneList);

		// 3. How to find duplicate elements in a given integers list in java using
		// Stream functions?
		List<Integer> num2 = Arrays.asList(1, 2, 3, 4, 2, 3, 1);
		List<Integer> duplicateNum = num2.stream().filter(x -> num2.indexOf(x) != num2.lastIndexOf(x))
				.collect(Collectors.toList());
		System.out.println(duplicateNum);

		Set<Integer> duplicate = num2.stream().filter(x -> num2.indexOf(x) != num2.lastIndexOf(x))
				.collect(Collectors.toSet());
		System.out.println(duplicate);

		Set<Integer> tempSet = new HashSet<>();
		long duplicateCount = num2.stream().filter(x -> tempSet.add(x) == false).count();
		System.out.println(duplicateCount);

		// 4. Given the list of integers, find the first element of the list using
		// Stream functions?
		int firstElement = num2.stream().findFirst().get();
		System.out.println(firstElement);

		// 5. Given a list of integers, find the total number of elements present in the
		// list using Stream functions?
		long totalEle = num1.stream().count();
		System.out.println(totalEle);

		// 6. Given a list of integers, find the maximum value element present in it
		// using Stream functions?
		int max = num1.stream().max((x, y) -> x - y).get();
		System.out.println(max);

		// 7. Sort the Employee object using salary?
		List<Employee> empLists = Arrays.asList(new Employee(101, "Partha", 32510), new Employee(102, "Kishore", 35000),
				new Employee(103, "Naveen", 28000), new Employee(104, "Ajay", 32500));
		List<Employee> sortList = empLists.stream().sorted((e1, e2) -> e1.salary - e2.salary)
				.collect(Collectors.toList());

		System.out.println(sortList);

		// 8. Given a list of integers, sort all the values present in it using Stream
		// functions?
		List<Integer> sort = num1.stream().sorted().collect(Collectors.toList());
		System.out.println(sort);

		// 9. Given a list of integers, sort all the values present in it in descending
		// order using Stream
		// functions?
		List<Integer> descSort = num1.stream().sorted((x, y) -> y - x).collect(Collectors.toList());
		System.out.println(descSort);

		// 10.. Given an integer array nums, return true if any value appears at least
		// twice in the array,
		// and return false if every element is distinct.
		tempSet.clear();
		boolean flag = num2.stream().filter(x -> tempSet.add(x) == false).count() > 0 ? true : false;
		System.out.println(flag);

		// 11. Java 8 program to find factorial of given list of integer values
		List<Integer> factNum = num.stream().map(x -> {
			int fact = 1;
			for (int i = 1; i <= x; i++)
				fact = fact * i;
			return fact;
		}).collect(Collectors.toList());
		System.out.println(factNum);

		// 12. Write a Java 8 program to sort an array and then convert the sorted array
		// into Stream?
		int arr[] = { 3, 5, 3, 1, 7 };
		Arrays.sort(arr);
		Arrays.stream(arr).forEach(System.out::println);

		// 13. Convert a List of String into upper case using stream
		List<String> str = Arrays.asList("Orange", "Apple", "Banana");
		List<String> uppCaseVal = str.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.println(uppCaseVal);

		// 14. Convert a List of String into a Map key and it's length as Map Value
		// using Java 8 Stream
		Map<String, Integer> map = str.stream().collect(Collectors.toMap(x -> x, x -> x.length()));
		System.out.println(map);

		// 15.Flat MAP
		List<Integer> even = Arrays.asList(2, 4, 6, 8);
		List<Integer> odd = Arrays.asList(1, 3, 5, 7, 9);
		List<List<Integer>> evenOdd = Arrays.asList(even, odd);
		System.out.println("Before Flattering");
		System.out.println(evenOdd);
		List<Integer> result = evenOdd.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println("After Flattering");
		System.out.println(result);

		// 16. Java 8 : Consumer
		Consumer<String> consumer = str1 -> System.out.println(str1);
		str.forEach(consumer);

		Consumer<Integer> evenConsumer = n -> {
			if (n % 2 == 0)
				System.out.println(n);
		};
		num.forEach(evenConsumer);

		// 17. Java 8 : Predicate
		Predicate<String> predicate = str2 -> str2.contains("p");
		str.stream().filter(predicate).forEach(System.out::println);

		Predicate<Integer> evenPredicate = n -> n % 2 == 0;
		num.stream().filter(evenPredicate).forEach(System.out::println);

		// 18. Java 8 : Function
		Function<String, Character> function = str3 -> str3.charAt(0);
		str.stream().map(function).forEach(System.out::println);

		Function<Integer, String> function1 = n -> {
			if (n % 2 == 0)
				return "Even";
			else
				return "Odd";
		};
		num.stream().map(function1).forEach(System.out::println);

		// 19. Supplier
		Supplier<String[]> supplier = () -> new String[] { "One", "Two", "Three" };
		Arrays.asList(supplier.get()).forEach(System.out::println);
		Predicate<String> myPredicate = str4 -> str4.contains("o") || str.contains("O");
		Function<String, Character> myFunction = str5 -> str5.charAt(0);
		Consumer<Character> myConsumer = c -> System.out.println(c);
		Arrays.asList(supplier.get()).stream().filter(myPredicate).map(myFunction).forEach(myConsumer);
	}
}
