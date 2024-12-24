package com.ems.main;

import java.util.Scanner;

import com.ems.model.Department;
import com.ems.model.Employee;
import com.ems.service.DepartmentService;
import com.ems.service.EmployeeService;
import com.ems.view.DepartmentView;
import com.ems.view.EmployeeView;

/**
 * @author Partha Sarathi Nanda
 * @version 1.0 This is my Main class
 */
public class EMSApp {

	static Scanner sc = new Scanner(System.in); // global scope

	public static int menu() {

		System.out.println("1. Insert Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Update Employee");
		System.out.println("4. Find Employee");
		System.out.println("5. Find All Employee");
		System.out.println("6. Insert Department");
		System.out.println("7. Delete Department");
		System.out.println("8. Update Department");
		System.out.println("9. Find All Department");
		System.out.println("10. Find All Department");
		System.out.println("11. Exit ");

		System.out.println("Enter your Choice :");
		int choice = sc.nextInt();
		return choice;
	}

//
//	/**
//	 * @param args It is my main method
//	 */
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		DepartmentService departmentService = new DepartmentService();
		Department department;
		String msg = "";

		do {
			int choice = menu();

			switch (choice) {
			case 1:
				Employee employee = EmployeeView.insertEmployeeView();
				String result = employeeService.insertEmployeeValidation(employee);
				System.out.println(result);
				break;
			case 2:
				int id = EmployeeView.deleteEmployeeView();
				result = employeeService.deleteEmployeeValidation(id);
				System.out.println(result);
				break;
			case 3:
				employee = EmployeeView.updateEmployeeView();
				result = employeeService.updateEmployeeValidation(employee);
				System.out.println(result);
				break;
			case 4:
				id = EmployeeView.findEmployeeView();
				result = employeeService.findEmployeeValidation(id);
				System.out.println(result);
				break;
			case 5:
				result = employeeService.findAllEmployeeValidation();
				System.out.println(result);
				break;
			case 6:
				department = DepartmentView.insertDepartmentView();
				result = departmentService.insertDepartmentValidation(department);
				System.out.println(result);
				break;
			case 7:
				int dno = DepartmentView.deleteDepartmentView();
				result = departmentService.deleteDepartmentValidation(dno);
				System.out.println(result);
				break;
			case 8:
				department = DepartmentView.updateDepartmentView();
				result = departmentService.updateDepartmentValidation(department);
				System.out.println(result);
				break;
			case 9:
				dno = DepartmentView.findDepartmentView();
				result = departmentService.findEmployeeValidation(dno);
				System.out.println(result);
				break;
			case 10:
				result = departmentService.findAllDepartmentValidation();
				System.out.println(result);
				break;
			case 11:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice !!");
				break;
			}
			System.out.println("Do you want to continue [Yes/No]");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("Yes"));
		sc.close();
	}
}
