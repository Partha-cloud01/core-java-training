package com.sces.main;

import java.util.Scanner;

import com.sces.model.Course;
import com.sces.model.Students;
import com.sces.service.CourseServiceImplents;
import com.sces.service.StudentsServiceImplements;
import com.sces.service.CourseService;
import com.sces.service.StudentsService;
import com.sces.view.CourseView;
import com.sces.view.StudentsView;

/**
 * @author Partha Sarathi Nanda
 * @version 1.0 This is my Main class
 */
public class SCESApp {

	static Scanner sc = new Scanner(System.in);

	/**
	 * @param args It is my main method
	 */
	public static void main(String[] args) {
		StudentsService studentService = new StudentsServiceImplements();
		CourseService courseService = new CourseServiceImplents();
		Course course;

		String msg = "";
		do {
			int choice = StudentsView.menu();

			switch (choice) {
			case 1:
				Students student = StudentsView.insertStudentsView();
				String result = studentService.insertStudentsValidation(student);
				StudentsView.printResult(result);
				break;
			case 2:
				int sid = StudentsView.deleteStudentsView();
				result = studentService.deleteStudentsValidation(sid);
				StudentsView.printResult(result);
				break;
			case 3:
				student = StudentsView.updateStudentsView();
				result = studentService.updateStudentsValidation(student);
				StudentsView.printResult(result);
				break;
			case 4:
				sid = StudentsView.findStudentsView();
				result = studentService.findStudentsValidation(sid);
				StudentsView.printResult(result);
				break;
			case 5:
				result = studentService.findAllStudentsValidation();
				StudentsView.printResult(result);
				break;
			case 6:
				course = CourseView.insertCourseView();
				result = courseService.insertCourseValidation(course);
				StudentsView.printResult(result);
				break;
			case 7:
				int id = CourseView.deleteCourseView();
				result = courseService.deleteCourseValidation(id);
				StudentsView.printResult(result);
				break;
			case 8:
				course = CourseView.updateCourseView();
				result = courseService.updateCourseValidation(course);
				StudentsView.printResult(result);
				break;
			case 9:
				id = CourseView.findCourseView();
				result = courseService.findCourseValidation(id);
				StudentsView.printResult(result);
				break;
			case 10:
				result = courseService.findAllCourseValidation();
				StudentsView.printResult(result);
				break;
			case 11:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice !!");
				break;
			}
			msg = StudentsView.exit();
		} while (msg.equalsIgnoreCase("Yes"));

	}

}
