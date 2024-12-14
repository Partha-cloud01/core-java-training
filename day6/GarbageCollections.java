package com.day6;

public class GarbageCollections {
	
	static int count = 0;
	
	GarbageCollections()
	{
		count++;
		System.out.println(count);
	}
	@Override
	protected void finalize() throws Throwable
	{
		count--;
		System.out.println(count);
	}

	public static void main(String[] args) {
		GarbageCollections obj1 = new GarbageCollections();
		GarbageCollections obj2 = new GarbageCollections();
		
		obj1 = null;
		System.gc();
		
		obj2 = null;
		Runtime.getRuntime().gc();
		
	}

}
