package com.day9;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		
		System.out.println(st);
		
		st.pop();
		System.out.println(st);
		
		System.out.println(st.peek()); //just show the first element it will not modify
		
	}

}