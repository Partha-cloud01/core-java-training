package com.day2;

public class This {
	int empId;
	String name;
	double empSalary;
	//constructor
	This(int eId, String eName, double salary)
	{
		this.empId = eId;
		this.name = eName;
		this.empSalary = salary;
		this.display();
	}
	This()
	{
		this(101, "Partha", 10000);   //current class constructor
	}
	
	//Constructor
	
	void display() {
		System.out.println("Employee Id :" + empId);
		System.out.println("Employee Name :" + name);
		System.out.println("Employee Salary :" + empSalary);
		System.out.println("");
	}

	public static void main(String[] args) {
		This e1 = new This();
	}

}
