package com.day1;
import java.lang.System;
import java.util.Scanner;

class Basic3
{
	public static void main(String args[])
	{
		Scanner imp =new Scanner(System.in);
		System.out.print("Enter your employee_id :");
		int id=imp.nextInt();
		System.out.print("Enter your Name :");
		String name = imp.next();
		System.out.print("Enter your Salary:");
		float Salary = imp.nextFloat();
		System.out.println("Your employee_id :" + id);
		System.out.println("Your Name : "+ name);
		System.out.println("Your Salary : " + Salary);
		imp.close();
	}
}



		