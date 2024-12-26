package com.sces.view;

import java.util.Scanner;

import com.sces.model.Course;
import com.sces.model.Students;

/**
 * This is my StudentsView class
 */
public class StudentsView {
		static Scanner sc = new Scanner(System.in);
		static int sid, course_Id;
		static String sname, saddress;
		/**
		 * @return choice This method is displaying the options to the user to choose
		 *         and returning to the choice.
		 */
		public static int menu()
		{
			System.out.println("1. Insert Students");
			System.out.println("2. Delete Students");
			System.out.println("3. Update Students");
			System.out.println("4. Find Students");
			System.out.println("5. Find All Students");
			System.out.println("6. Insert Course");
			System.out.println("7. Delete Course");
			System.out.println("8. Update Course");
			System.out.println("9. Find Course");
			System.out.println("10. Find All Course");
			System.out.println("11. Exit ");

			System.out.println("Enter your Choice :");
			int choice = sc.nextInt();
			return choice;
		}
		/**
		 * exit method
		 * @return msg
		 */
		public static String exit()
		{
			System.out.println("Do you want to continue [Yes/No]");
			return sc.next();
		}
		/**
		 * @param result
		 * @return results
		 * this method is for displaying the output
		 */

		public static void printResult(String result) {
			System.out.println(result);
		}
		
		//insertion of students
		public static Students insertStudentsView() {
			System.out.println("Enter Students sid, sname, saddress, course_Id");
			
			sid = sc.nextInt();
			sname = sc.next();
			saddress = sc.next();
			course_Id = sc.nextInt();
			
			Course course_Id1 = new Course();
			course_Id1.setCourse_Id(course_Id);
			return new Students (sid, sname, saddress, course_Id1); // model object
		}
		
		// Deleting the student data
		public static int deleteStudentsView() {
			System.out.println("Enter Student Id");
			return sc.nextInt();

		}
		
		// Updating the Student data
		public static Students updateStudentsView() {
			System.out.println("Enter Students sid, sName, saddress and course_Id");
			
			sid = sc.nextInt();
			sname = sc.next();
			saddress = sc.next();
			course_Id = sc.nextInt();
			
			Course course_Id1 = new Course();
			course_Id1.setCourse_Id(course_Id);
			return new Students (sid, sname, saddress, course_Id1);  // model object
		}
		
		// Find the student data by id
		public static int findStudentsView() {
			System.out.println("Enter Student Id");
			return sc.nextInt();
		}

}
