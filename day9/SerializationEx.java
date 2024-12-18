package com.day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	private String empName;
	private transient int empId;
	private double empSalary;
	
	public Employee(String empName, int empId, double empSalary) {
		
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	
}

public class SerializationEx {
	public static void main(String[] args) throws Exception {
		Employee obj = new Employee("Partha",1001,20000);
		//Serialization
		FileOutputStream fos = new FileOutputStream("D://ObjectFile.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(obj);
		oos.close();
		fos.close();
		System.out.println("My Object saved in the external Device");
		
		System.out.println("*****************");
		
		//de-serialization
		
		FileInputStream fis = new FileInputStream("D://ObjectFile.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp = (Employee) ois.readObject();
		ois.close();
		fis.close();
		
		System.out.println("Employee Id : " + emp.getEmpId());
		System.out.println("Employee Name : " + emp.getEmpName());
		System.out.println("Employee Salary : " + emp.getEmpSalary());
	}
}
