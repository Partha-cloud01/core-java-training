package com.day10;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashTableExp {

	public static void main(String[] args) {
		Map<Integer, String> map = new Hashtable<>();

		map.put(10, "Partha");
		map.put(20, "Kishore");
		map.put(40, "Ajay");
		map.put(30, "Naveen");
		//map.put(null, "Steven");
		System.out.println(map);

		//map.put(20, null);
		System.out.println(map);
		map.put(20, "Kishore");
		
		//map.remove(null);
		System.out.println(map);
		
		System.out.println(map.get(30));
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey(10));
		System.out.println(map.containsValue("Kishore"));
		
		Set<Integer> set = map.keySet();
		System.out.println(set);
		//way1
		for(Integer keys : set)
		{
			System.out.println(keys +"=>"+ map.get(keys));
		}
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
		{
			Integer key = it.next();
			System.out.println(key +"=>"+ map.get(key));
		}
		//way2 is binding both key and value
		Set<Entry<Integer, String>> enteries = map.entrySet();
		System.out.println(enteries);
		
		for(Entry<Integer, String> etr : enteries) 
		{
			System.out.println(etr.getKey() +"=>"+ etr.getValue());
		}
		
		Iterator<Entry<Integer, String>> itr1 = enteries.iterator();
		while(itr1.hasNext())
		{
			Entry<Integer, String> entry = itr1.next();
			System.out.println(entry.getKey() +"=>"+ entry.getValue());
		}
	}

}
