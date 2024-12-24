package com.ems.service;

import com.ems.model.Department;
import com.ems.repo.DepartmentRepo;

public class DepartmentService {
	DepartmentRepo departmentRepo = new DepartmentRepo();

	public String insertDepartmentValidation(Department department) {
		String result;
		if (department == null) { // Validation of employee object.
			result = "department object is Null";
		} else if (department.getDno() == 0 || department.getdName() == null) {
			result = "Invalid Employee Data";
		} else {
			boolean flag = departmentRepo.doInsertDepartment(department);
			if (flag) {
				result = "Department Object Saved";
			} else {
				result = "Department Object not saved";
			}
		}
		return result;
	}

	public String deleteDepartmentValidation(int dno) {

		String result = "";

		if (dno == 0) {
			result = "Invalid Dno";
		} else {
			boolean flag = departmentRepo.doDeleteDepartment(dno);
			if (flag) {
				result = "Department Object Deleted";
			} else {
				result = "Department Object not Found!!";
			}
		}
		return result;
	}

	public String updateDepartmentValidation(Department department) {
		boolean flag = false;
		String result;
		if (department == null) { // Validation of employee object.
			result = "Employee object is Null";
		} else if (department.getDno() == 0 || department.getdName() == null) {
			result = "Invalid Employee Data";
		} else {
			flag = departmentRepo.doUpdateDepartment(department);
			if (flag) {
				result = "Department Object Saved";
			} else {
				result = "Department Object Not Found!!";
			}
		}
		return result;
	}

	public String findEmployeeValidation(int dno) {
		String result;
		if (dno == 0) {
			result = "Invalid Id";
		} else {
			Department department = departmentRepo.doFindDepartment(dno);
			if (department != null) {
				result = department.toString();
			} else {
				result = "Employee Object not Found!!";
			}
		}
		return result;
	}

	public String findAllDepartmentValidation() {
		return departmentRepo.doFindAllDepartment().toString();
	}

}
