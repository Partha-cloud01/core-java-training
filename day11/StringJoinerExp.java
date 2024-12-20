package com.day11;

import java.util.StringJoiner;

public class StringJoinerExp {

	public static void main(String[] args) {
		StringJoiner joiner = new StringJoiner(",","[","]");  //separator(,) prefix("[") suffix("]")
		
//		joiner.add("One");
//		joiner.add("Two");
//		joiner.add("Three");
//		
//		String result = joiner.toString();
//		
//		System.out.println(result);
		
		joiner.add("Red");
		joiner.add("Green");
		joiner.add("Blue");
		
		String result = joiner.toString();
		
		System.out.println(result);

	}

}
