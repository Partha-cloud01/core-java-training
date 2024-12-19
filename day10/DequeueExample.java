package com.day10;

import java.util.Deque;
import java.util.LinkedList;

public class DequeueExample {

	public static void main(String[] args) {
		Deque<Integer> d = new LinkedList<Integer>();

		d.offer(10);
		d.offer(20);
		d.offer(40);
		d.offer(30);
		d.offer(40);
		d.offerFirst(91); //we can add elements both the side at first 
		d.offerLast(12); // also at last
		//d.offer(null);
		//d.offer(null);
		
		System.out.println(d); // 10, 20, 40, 30, 40

		d.poll(); // remove 10 
		System.out.println(d);
	}

}
