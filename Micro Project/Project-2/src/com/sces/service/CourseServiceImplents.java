package com.sces.service;

import com.sces.model.Course;
import com.sces.repo.CourseRepo;
import com.sces.repo.CourseRepoImplemnts;

public class CourseServiceImplents implements CourseService {

	CourseRepo courseRepo = new CourseRepoImplemnts();

	public String insertCourseValidation(Course course) {
		String result;
		if (course == null) { // Validation of employee object.
			result = "Course object is Null";
		} else if (course.getCourse_Id() == 0 || course.getCourse_Name() == null || course.getInstructor() == null) {
			result = "Invalid Course Data";
		} else {
			boolean flag = courseRepo.doInsertCourse(course);
			if (flag) {
				result = "Course Object Saved";
			} else {
				result = "Course Object not saved";
			}
		}
		return result;
	}

	public String deleteCourseValidation(int id) {

		String result = "";

		if (id == 0) {
			result = "Invalid Id";
		} else {
			boolean flag = courseRepo.doDeleteCourse(id);
			if (flag) {
				result = "Course Object Deleted";
			} else {
				result = "Course Object not Found!!";
			}
		}
		return result;
	}

	public String updateCourseValidation(Course course) {
		boolean flag = false;
		String result;
		if (course == null) { // Validation of employee object.
			result = "Course object is Null";
		} else if (course.getCourse_Id() == 0 || course.getCourse_Name() == null || course.getInstructor() == null) {
			result = "Invalid Course Data";
		} else {
			flag = courseRepo.doUpdateCourse(course);
			if (flag) {
				result = "Course Object Saved";
			} else {
				result = "Course Object Not Found!!";
			}
		}
		return result;
	}

	public String findCourseValidation(int id) {
		String result;
		if (id == 0) {
			result = "Invalid Id";
		} else {
			Course course = courseRepo.doFindCourse(id);
			if (course != null) {
				result = course.toString();
			} else {
				result = "Course Object not Found!!";
			}
		}
		return result;
	}

	public String findAllCourseValidation() {
		return courseRepo.doFindAllCourse().toString();
	}

}
