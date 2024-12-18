package com.day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		//list.add(new Integer(10));
		list.add(10);
		list.add(30);
		list.add(20); //directly consuming as objects because of auto boxing. 
		list.add(30);
		list.add(23);
		//remove the odd no.
		Iterator<Integer> it1 = list.iterator();
		while(it1.hasNext())
		{
			Integer t = it1.next();
			if(t % 2 == 1)
			{
				it1.remove();  //for removing the odd object
			}
		}
		System.out.println(list);
	}

}
