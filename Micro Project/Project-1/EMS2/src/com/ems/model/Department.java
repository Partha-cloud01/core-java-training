package com.ems.model;

public class Department {
	private int dno;
	private String dName;

	// empty constructor.
	public Department() {
		super();
	}

	// constructor using fields
	public Department(int dno, String dName) {
		super();
		this.dno = dno;
		this.dName = dName;
	}

	// getter and setter methods
	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	@Override
	public String toString() {
		return "Department [dno=" + dno + ", dName=" + dName + "]";
	}

}
