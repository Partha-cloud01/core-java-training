package com.day8;

public class StringClass1 {

	public static void main(String[] args) {
		
		String s1 = "Partha"; //first way to declare a String
	
		String s2 = new String("Welcome All"); //second way to declare String
		
		char ch1 [] = {'H','I'}; //third way of declaring the char array in 
		String s3 = new String(ch1); // passing it into the String type.
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
