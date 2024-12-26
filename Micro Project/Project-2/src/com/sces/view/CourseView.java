package com.sces.view;

import java.util.Scanner;

import com.sces.model.Course;

public class CourseView {

	static Scanner sc = new Scanner(System.in);
	static int cid;
	static String cName, cInstructor;

	public static Course insertCourseView() {
		System.out.println("Enter Course cid, cname, cInstructor");

		cid = sc.nextInt();
		cName = sc.next();
		cInstructor = sc.next();

		return new Course(cid, cName, cInstructor); // model object
	}

	public static int deleteCourseView() {
		System.out.println("Enter Course Id");
		return sc.nextInt();

	}

	public static Course updateCourseView() {
		System.out.println("Enter Course cid, cname, cInstructor");

		cid = sc.nextInt();
		cName = sc.next();
		cInstructor = sc.next();

		return new Course(cid, cName, cInstructor); // model object
	}

	public static int findCourseView() {
		System.out.println("Enter Course Id");
		return sc.nextInt();
	}

}
