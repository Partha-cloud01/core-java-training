package com.ems.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.ems.model.Department;
import com.ems.model.Employee;
import com.ems.util.DBUtil;

public class EmployeeRepo {
	DepartmentRepo departmentRepo = new DepartmentRepo();

	public boolean doInsertEmployee(Employee employee) {
		boolean flag = false;
		try {

			Connection con = DBUtil.getConnection();
			String sql = "insert into partha_employee1 values(?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, employee.getEid());
			ps.setString(2, employee.geteName());
			ps.setInt(3, employee.geteSalary());
			ps.setInt(4, employee.getDepartment().getDno());

			int n = ps.executeUpdate();
			if (n == 1)

				flag = true;
		} catch (SQLException e) {
			System.out.println("Insert Query not executed");
		}
		return flag;
	}

	public boolean doDeleteEmployee(int id) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getConnection();
			String sql = "delete partha_employee1 where eid = (?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			int n = ps.executeUpdate();
			if (n == 1)
				flag = true;
		} catch (SQLException e) {
			System.out.println("Insert Query not executed");
		}
		return flag;
	}

	public boolean doEmployeeUpdate(Employee employee) {
		boolean flag = false;
		try {

			Connection con = DBUtil.getConnection();
			String sql = "update partha_employee1 set ename = ?, esalary = ?, did = ? where eid = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, employee.geteName());
			ps.setInt(2, employee.geteSalary());
			ps.setInt(3, employee.getDepartment().getDno());
			ps.setInt(4, employee.getEid());

			int n = ps.executeUpdate();
			if (n == 1)

				flag = true;
		} catch (SQLException e) {
			System.out.println("Insert Query not executed");
		}
		return flag;
	}

	public Employee doFindEmployee(int id) {
		Employee employee = null;

		try {
			Connection con = DBUtil.getConnection();
			String sql = "select * from partha_employee1 where eid = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				employee = new Employee();
				employee.setEid(rs.getInt("eid"));
				employee.seteName(rs.getString("ename"));
				employee.seteSalary(rs.getInt("esalary"));
				
				int deptno = rs.getInt("did");
				Department department = departmentRepo.doFindDepartment(deptno);
				employee.setDepartment(department);
				
			}
		} catch (SQLException e) {
			System.out.println("Insert Query not executed");
		}
		return employee;
	}

	public List<Employee> doFindAllEmployee() {
		
		List<Employee> list = new LinkedList<>();
		try {
			Connection con = DBUtil.getConnection();
			String sql = "select * from partha_employee1";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee employee = new Employee();
				employee.setEid(rs.getInt("eid"));
				employee.seteName(rs.getString("ename"));
				employee.seteSalary(rs.getInt("esalary"));
				
				int deptno = rs.getInt("did");
				Department department = departmentRepo.doFindDepartment(deptno);
				employee.setDepartment(department);
				
				list.add(employee);
			}
		} catch (SQLException e) {
			System.out.println("Find Query not executed");
		}
		return list;
	}
}
