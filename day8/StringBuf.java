package com.day8;

public class StringBuf {

	public static void main(String[] args) {
		String s1 = new String("Java");
		s1.concat("World");
		System.out.println(s1);
		
		s1 = s1.concat(" World");
		System.out.println(s1);
		
		StringBuffer s2 = new StringBuffer("Java");  //we can update for the same memory address 
		s2.append(" World");                        //without reassigning to the object reference.
		System.out.println(s2);

	}

}
