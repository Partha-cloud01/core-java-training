package com.sces.repo;

import java.util.List;

import com.sces.model.Course;

public interface CourseRepo {
	
	public boolean doInsertCourse(Course course);
	public boolean doDeleteCourse(int id);
	public boolean doUpdateCourse(Course course);
	public Course doFindCourse(int id);
	public List<Course> doFindAllCourse();

}
