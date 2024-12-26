package com.sces.service;

import com.sces.model.Course;

public interface CourseService {
	
	public String insertCourseValidation(Course course);
	public String deleteCourseValidation(int id);
	public String updateCourseValidation(Course course);
	public String findCourseValidation(int id);
	public String findAllCourseValidation();
	
}
