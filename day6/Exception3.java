package com.day6;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception3 {
	 
	void method1()throws FileNotFoundException
	{
		FileReader read = new FileReader("Kishore.txt");
	}
	void method2()
	{
		try 
		{
			method1();
		}
		catch(FileNotFoundException e){
			System.out.println("Kishore file does not exits");
		}
	}

	public static void main(String[] args) {
		Exception3 n = new Exception3();
		n.method2();

	}

}
