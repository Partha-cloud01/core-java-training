package com.day10;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.offer(10);
		q.offer(20);
		q.offer(40);
		q.offer(30);
		q.offer(40);
		q.offer(null);
		q.offer(null);
		System.out.println(q); //10, 20, 40, 30, 40
		
		q.poll(); //remove 10
		System.out.println(q);

	}

}
