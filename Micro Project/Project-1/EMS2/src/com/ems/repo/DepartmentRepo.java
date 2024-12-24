package com.ems.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.ems.model.Department;
import com.ems.util.DBUtil;

public class DepartmentRepo {
	public boolean doInsertDepartment(Department department) {
		boolean flag = false;
		try {

			Connection con = DBUtil.getConnection();
			String sql = "insert into partha_department values(?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, department.getDno());
			ps.setString(2, department.getdName());
			
			int n = ps.executeUpdate();
			if (n == 1)

				flag = true;
		} catch (SQLException e) {
			System.out.println("Insert Query not executed");
		}
		return flag;
	}
	
	public boolean doDeleteDepartment(int dno) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getConnection();
			String sql = "delete partha_department where did = (?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, dno);

			int n = ps.executeUpdate();
			if (n == 1)
				flag = true;
		} catch (SQLException e) {
			System.out.println("Insert Query not executed");
		}
		return flag;
	}

	public boolean doUpdateDepartment(Department department) {
		boolean flag = false;
		try {

			Connection con = DBUtil.getConnection();
			String sql = "update partha_department set dname = ? where did = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, department.getdName());
			ps.setInt(2, department.getDno());
			
			int n = ps.executeUpdate();
			if (n == 1)

				flag = true;
		} catch (SQLException e) {
			System.out.println("Insert Query not executed");
		}
		return flag;
	}
	public Department doFindDepartment(int dno) {
		Department department = null;

		try {
			Connection con = DBUtil.getConnection();
			String sql = "select * from partha_department where did = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, dno);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				department = new Department();
				department.setDno(rs.getInt("did"));
				department.setdName(rs.getString("dname"));
			}
		} catch (SQLException e) {
			System.out.println("Insert Query not executed");
		}
		return department;
	}
	
	public List<Department> doFindAllDepartment() {
		List<Department> list = new LinkedList<>();
		try {
			Connection con = DBUtil.getConnection();
			String sql = "select * from partha_department";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Department department = new Department();
				department.setDno(rs.getInt("did"));
				department.setdName(rs.getString("dname"));
				list.add(department);
			}
		} catch (SQLException e) {
			System.out.println("Find Query not executed");
		}
		return list;
	}
}
