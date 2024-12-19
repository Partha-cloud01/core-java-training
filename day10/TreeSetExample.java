package com.day10;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		//we cannot go with the object generic we get class cast exception
		Set<Integer> s = new TreeSet<Integer>(Collections.reverseOrder()); //it will take reverse order of the input.  
		
		s.add(10);
		s.add(30);
		s.add(20);
		s.add(40);
		s.add(20); // not allow duplicate value.
		
		//s.add(null);//we cannot compare the null values with the previous one.
		//s.add(null);
		
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
