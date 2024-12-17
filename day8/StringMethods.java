package com.day8;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = "Java";
		
		char ch[] = s1.toCharArray(); //converting string to char array.
		
		for(char c : ch)
		{
			System.out.println(c);
		}
		System.out.println("------------- ");
		for (int i = 0; i < s1.length(); i++)
		{
			System.out.println(s1.charAt(i));
		}
		
		String s2 = "Welcome to the java";
		
		String[] arr = s2.split(" ");
		for(String s : arr)
		{
			System.out.print(s);
		}
	}

}
