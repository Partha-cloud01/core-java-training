package com.ems.view;

import java.util.Scanner;

import com.ems.model.Department;

public class DepartmentView {
	static Scanner sc = new Scanner(System.in);
	static int dno;
	static String dname;

	public static Department insertDepartmentView() {
		System.out.println("Enter dno, dname");

		dno = sc.nextInt();
		dname = sc.next();
		return new Department(dno, dname); // model object
	}

	public static int deleteDepartmentView() {
		System.out.println("Enter Department Id");
		return sc.nextInt();
	}

	public static Department updateDepartmentView() {
		System.out.println("Enter department dno and dname");

		dno = sc.nextInt();
		dname = sc.next();

		return new Department(dno, dname); // model object
	}

	public static int findDepartmentView() {
		System.out.println("Enter Department no");
		return sc.nextInt();
	}

}
