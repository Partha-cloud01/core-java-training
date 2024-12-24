package com.ems.model;

public class Employee {

	private int eid;
	private String eName;
	private int eSalary;
	private Department department; // HAS-A

	public Employee() {
		super();
	}

	public Employee(int eid, String eName, int eSalary, Department department) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.eSalary = eSalary;
		this.department = department;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int geteSalary() {
		return eSalary;
	}

	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", eSalary=" + eSalary + ", department=" + department
				+ "]";
	}

}
