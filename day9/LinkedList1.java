package com.day9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedList1 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		//list.add(new Integer(10));
		list.add(10);
		list.add(30);
		list.add(20); //directly consuming as objects because of auto boxing. 
		list.add(30);

		System.out.println(list);
		list.add(1,25);       //add method from list
		System.out.println(list);
		System.out.println("*******");
		System.out.println(list.get(0));
		//list.remove(1);
		System.out.println(list);
		
		//list.set(0, null);
		System.out.println(list.contains(20));
		
		System.out.println(list.size());

		System.out.println(list.isEmpty());
		
		//list.clear(); // it will clear the full list.
		System.out.println(list);
		
		//way1 to traverse
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		//way2 to traverse
		for (Integer i : list)
		{
			System.out.println(i);
		}
		//way3 for traverse
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//way4 for traverse
		ListIterator<Integer> li = list.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
	}

}
