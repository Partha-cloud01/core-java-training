package com.day8;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		String s1 = "Welcome to the Java World";
		
		StringTokenizer st = new StringTokenizer(s1," ");
		
		System.out.println(st.countTokens());
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}

	}

}
