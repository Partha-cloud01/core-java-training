package com.day8;

public class StringExample {

	public static void main(String[] args) {
		String s1 = "Hello Java";

		System.out.println(s1.length()); // it return the length of the String.
		System.out.println(s1.charAt(4));//it will show the char present at the index no.
		System.out.println(s1.concat("World")); //it will concat the string with the present string without giving space.
		
		System.out.println(s1.equals("Hello java"));//it will compare the two string and if equals give true or else false.
		System.out.println(s1.equalsIgnoreCase("Hello java"));//it will ignore the case and compare.
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.indexOf('b'));
		
		System.out.println(s1.startsWith("he"));//it case sensitive and check from index 0 equals then true
		System.out.println(s1.endsWith("ba")); //or else false.
		
		System.out.println(s1.replace('e', 'a')); //it will replace the character with the new character.
		
		System.out.println(s1.toUpperCase()); //it will change the string character to capital letters.
		System.out.println(s1.toLowerCase());//it will change the string character to small letters.

		System.out.println(s1.substring(3, 7));
		System.out.println(s1.substring(3));
		System.out.println(s1.compareTo("Hello Java"));//if equal then return 0 otherwise 1 or -1.

	}

}
