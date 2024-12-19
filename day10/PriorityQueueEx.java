package com.day10;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		pq.offer(20);
		pq.offer(10);
		pq.offer(40);
		pq.offer(30);
		pq.offer(5);
		
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		
	}

}
