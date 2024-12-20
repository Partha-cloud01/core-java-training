package com.ems.repo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import com.ems.model.Employee;
import com.ems.util.DBUtil;

/**
 * @author Partha Sarathi Nanda
 * @version 1.0 It is performing all CRUD operations on Map.
 */
public class EmployeeRepo1 {
	/**
	 * @param employee
	 * @return boolean It is performing create employee on Map DB
	 */

	public boolean doInsert(Employee employee) {

		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		map.put(employee.getEid(), employee); // true and false boolean value will go to service layer
		return true;
	}

	/**
	 * @Param id
	 * @return boolean It is performing delete employee on Map DB
	 */

	public boolean doDelete(int id) {

		boolean flag = false;
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		if (map.containsKey(id)) // map is easy no need for iteration,contains will help in finding the object by
									// the key
		{
			map.remove(id);
			flag = true;
		}
		return flag;
	}
	/**
	 * @Param employee 
	 * @return boolean It is performing update on employee on Map DB
	 */

	public boolean doUpdate(Employee employee) {
		boolean flag = false;
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		if (map.containsKey(employee.getEid())) {
			map.put(employee.getEid(), employee);
			flag = true;
		}
		return flag;
	}

	/**
	 * @Param id
	 * @return Employee It is performing displaying Employee data based on the id
	 * from Map DB
	 */
	public Employee doFind(int id) {
		Employee employee = null;
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		if (map.containsKey(id)) {
			employee = map.get(id);
		}
		return employee;
	}
	/**
	 * @return list of Employees It is performing display for all the employees and
	 * returning the list from Map DB
	 */

	public List<Employee> doFindAll() {
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		Collection<Employee> collection = map.values();
		List<Employee> list = new LinkedList<>();
		for (Employee e : collection) {
			list.add(e);
		}
		return list; // returning list of employee.
	}

}
