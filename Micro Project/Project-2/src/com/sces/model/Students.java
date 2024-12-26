package com.sces.model;

public class Students {
	private int student_Id;
	private String stud_Name;
	private String address;
	private Course course; //HAS A Relationship.

	public Students() {
		super();
	}

	public Students(int student_Id, String stud_Name, String address, Course course) {
		super();
		this.student_Id = student_Id;
		this.stud_Name = stud_Name;
		this.address = address;
		this.course = course;
	}

	public int getStudent_Id() {
		return student_Id;
	}

	public void setStudent_Id(int student_Id) {
		this.student_Id = student_Id;
	}

	public String getStud_Name() {
		return stud_Name;
	}

	public void setStud_Name(String stud_Name) {
		this.stud_Name = stud_Name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Students [student_Id=" + student_Id + ", stud_Name=" + stud_Name + ", address=" + address + ", course="
				+ course+ "]";
	}

	
}
