package com.day10;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashExample {

	public static void main(String[] args) {

		Set<Integer> s = new LinkedHashSet<Integer>();
		
		s.add(10);
		s.add(30);
		s.add(20);
		s.add(40);
		s.add(20); // not allow duplicate value.
		
		s.add(null);
		s.add(null);
		
		System.out.println(s);
		
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		System.out.println(s.contains(30));
		
		//way1
		for(Integer i : s)
		{
			System.out.println(i);
		}
		
		//way2
		Iterator<Integer> it = s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
