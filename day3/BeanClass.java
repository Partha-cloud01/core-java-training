package com.day3;

class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

public class BeanClass {
	public static void main(String[] args) {

		Employee n = new Employee(101, "Partha", 10000);
		System.out.println(n.getId());
		System.out.println(n.getName());
		System.out.println(n.getSalary());
	}

}
