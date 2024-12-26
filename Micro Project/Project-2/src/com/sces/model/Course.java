package com.sces.model;

public class Course {
	private int course_Id;
	private String course_Name;
	private String instructor;

	public Course() {
		super();
	}

	public Course(int course_Id, String course_Name, String instructor) {
		super();
		this.course_Id = course_Id;
		this.course_Name = course_Name;
		this.instructor = instructor;
	}

	public int getCourse_Id() {
		return course_Id;
	}

	public void setCourse_Id(int course_Id) {
		this.course_Id = course_Id;
	}

	public String getCourse_Name() {
		return course_Name;
	}

	public void setCourse_Name(String course_Name) {
		this.course_Name = course_Name;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	@Override
	public String toString() {
		return "Course [course_Id=" + course_Id + ", course_Name=" + course_Name + ", instructor=" + instructor + "]";
	}

	

}