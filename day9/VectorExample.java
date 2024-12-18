package com.day9;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<Integer> veco = new Vector<>(3,2);
		
		System.out.println(veco.size());  //0
		System.out.println(veco.capacity());  //3
		
		veco.add(20);
		veco.add(30);
		veco.add(10);
		
		System.out.println(veco.size()); //3
		System.out.println(veco.capacity()); //3
		
		veco.add(40);
		
		System.out.println(veco.size()); //4
		System.out.println(veco.capacity()); //5
		veco.add(70);
		System.out.println(veco.size()); //5
		System.out.println(veco.capacity()); //5
		
		System.out.println();
		//Enumeration iterator
		Enumeration<Integer> ei = veco.elements();
		while(ei.hasMoreElements())
		{
			System.out.println(ei.nextElement());
		}
	}
}
