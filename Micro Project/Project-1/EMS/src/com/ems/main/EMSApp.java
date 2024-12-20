package com.ems.main;

import java.util.Scanner;

import com.ems.model.Employee;
import com.ems.service.EmployeeService;

/**
 * @author Partha Sarathi Nanda
 * @version 1.0 This is my Main class
 */
public class EMSApp {

	static Scanner sc = new Scanner(System.in);

	/**
	 * @return choice This method is displaying the options to the user to choose
	 *         and returning to the choice.
	 */
	public static int menu() {
		System.out.println("1. Insert Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Update Employee");
		System.out.println("4. Find Employee");
		System.out.println("5. Find All Employee");
		System.out.println("6. Exit");

		System.out.println("Enter your Choice :");
		int choice = sc.nextInt();
		return choice;
	}

	/**
	 * @return model Object It is getting the user input(Data) from user and passing
	 *         it to caller.
	 */
	public static Employee insertView() {
		System.out.println("Enter Employee Id, Name and Salary");

		Employee employee = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
		return employee; // model object
	}

	public static int deleteView() {
		System.out.println("Enter Employee Id");
		return sc.nextInt();

	}

	public static Employee updateView() {
		System.out.println("Enter Employee Id, Name and Salary");

		Employee employee = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
		return employee; // model object
	}

	public static int findView() {
		System.out.println("Enter Employee Id");
		return sc.nextInt();
	}

	/**
	 * @param args It is my main method
	 */
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();

		String msg = "";
		do {
			int choice = menu();

			switch (choice) {
			case 1:
				Employee employee = insertView();
				String result = employeeService.insertValidation(employee);
				System.out.println(result);
				break;
			case 2:
				int id = deleteView();
				result = employeeService.deleteValidation(id);
				System.out.println(result);
				break;
			case 3:
				employee = updateView();
				result = employeeService.updateValidation(employee);
				System.out.println(result);
				break;
			case 4:
				id = findView();
				result = employeeService.findValidation(id);
				System.out.println(result);
				break;
			case 5:
				result = employeeService.findAllValidation();
				System.out.println(result);
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice !!");
				break;
			}
			System.out.println("Do you want to continue [Yes/No]");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("Yes"));

	}

}
