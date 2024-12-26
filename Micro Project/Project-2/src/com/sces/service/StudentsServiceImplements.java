package com.sces.service;

import com.sces.model.Students;
import com.sces.repo.StudentsRepo;
import com.sces.repo.StudentsRepoImplemnts;
/**
 * @author Partha Sarathi Nanda
 * This class is to validate the students data which implements my StudentsService Interface.
 */
public class StudentsServiceImplements implements StudentsService {
	
	StudentsRepo studentRepo = new StudentsRepoImplemnts();

	public String insertStudentsValidation(Students student) {
		String result;
		if (student == null) { // Validation of employee object.
			result = "Students object is Null";
		} else if (student.getStudent_Id() == 0 || student.getStud_Name() == null || student.getAddress() == null
				|| student.getCourse().getCourse_Id() == 0) {
			result = "Invalid Students Data";
		} else {
			boolean flag = studentRepo.doInsertStudents(student);
			if (flag) {
				result = "Student Object Saved";
			} else {
				result = "Student Object not saved";
			}
		}
		return result;
	}
	
	public String deleteStudentsValidation(int sid) {

		String result = "";

		if (sid == 0) {
			result = "Invalid Id";
		} else {
			boolean flag = studentRepo.doDeleteStudents(sid);
			if (flag) {
				result = "Employee Object Deleted";
			} else {
				result = "Employee Object not Found!!";
			}
		}
		return result;
	}

	public String updateStudentsValidation(Students student) {
		boolean flag = false;
		String result;
		if (student == null) { // Validation of employee object.
			result = "Student object is Null";
		} else if (student.getStudent_Id() == 0 || student.getStud_Name() == null || student.getAddress() == null
				|| student.getCourse().getCourse_Id() == 0) {
			result = "Invalid Student Data";
		} else {
			flag = studentRepo.doUpdateStudents(student);
			if (flag) {
				result = "Student Object Saved";
			} else {
				result = "Student Object Not Found!!";
			}
		}
		return result;
	}

	public String findStudentsValidation(int id) {
		String result;
		if (id == 0) {
			result = "Invalid Id";
		} else {
			Students student = studentRepo.doFindStudents(id);
			if (student != null) {
				result = student.toString();
			} else {
				result = "Student Object not Found!!";
			}
		}
		return result;
	}

	public String findAllStudentsValidation() {
		return studentRepo.doFindAllStudents().toString();
	}

}
