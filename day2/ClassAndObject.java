package com.day2;

class Employee {
	int empId;
	String name;
	double empSalary;
	//constructor
	Employee(int eId, String eName, double salary)
	{
		this.empId = eId;
		this.name = eName;
		this.empSalary = salary;
	}
	
	//Constructor
	
	void display() {
		System.out.println("Employee Id :" + empId);
		System.out.println("Employee Name :" + name);
		System.out.println("Employee Salary :" + empSalary);
		System.out.println("");
	}
}

public class ClassAndObject {

	public static void main(String[] args) {
		Employee e = new Employee(101, "Kishore", 1000);
		Employee e1 = new Employee(102, "Partha", 950);
		e.display();
		e1.display();
	}

}
