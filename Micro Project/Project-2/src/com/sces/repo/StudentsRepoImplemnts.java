package com.sces.repo;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import com.sces.model.Course;
import com.sces.model.Students;
import com.sces.util.DBUtil;

public class StudentsRepoImplemnts implements StudentsRepo{
	CourseRepo courseRepo = new CourseRepoImplemnts();
	
	public boolean doInsertStudents(Students student) {
		boolean flag = false;
		try {

			Connection con = DBUtil.getConnection();
			String sql = "insert into partha_students values(?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, student.getStudent_Id());
			ps.setString(2, student.getStud_Name());
			ps.setString(3, student.getAddress());
			ps.setInt(4, student.getCourse().getCourse_Id());

			int n = ps.executeUpdate();
			if (n == 1)

				flag = true;
		} catch (SQLException e) {
			System.out.println("Insert Query not executed");
		}
		return flag;
	}

	public boolean doDeleteStudents(int id) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getConnection();
			String sql = "delete partha_students where student_id = (?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			int n = ps.executeUpdate();
			if (n == 1)
				flag = true;
		} catch (SQLException e) {
			System.out.println("Delete Query not executed");
		}
		return flag;
	}

	public boolean doUpdateStudents(Students student) {
		boolean flag = false;
		try {

			Connection con = DBUtil.getConnection();
			String sql = "update partha_students set student_Name = ?, student_address = ?, cid = ? where student_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, student.getStud_Name());
			ps.setString(2, student.getAddress());
			ps.setInt(3, student.getCourse().getCourse_Id());
			ps.setInt(4, student.getStudent_Id());

			int n = ps.executeUpdate();
			if (n == 1)

				flag = true;
		} catch (SQLException e) {
			System.out.println("Update Query not executed");
		}
		return flag;
	}

	public Students doFindStudents(int id) {
		Students student = null;

		try {
			Connection con = DBUtil.getConnection();
			String sql = "select * from partha_students where student_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				student = new Students();
				
				student.setStudent_Id(rs.getInt("student_id"));
				student.setStud_Name(rs.getString("student_Name"));
				student.setAddress(rs.getString("student_address"));
				
				int course12 = rs.getInt("cid");
				Course course = courseRepo.doFindCourse(course12);
				student.setCourse(course);
				
			}
		} catch (SQLException e) {
			System.out.println("Find Query not executed");
		}
		return student;
	}

	public List<Students> doFindAllStudents() {
		
		List<Students> list = new LinkedList<>();
		try {
			Connection con = DBUtil.getConnection();
			String sql = "select * from partha_students";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Students student = new Students();
				student.setStudent_Id(rs.getInt("student_id"));
				student.setStud_Name(rs.getString("student_Name"));
				student.setAddress(rs.getString("student_address"));
				
				int course12 = rs.getInt("cid");
				Course course = courseRepo.doFindCourse(course12);
				student.setCourse(course);
				
				
				list.add(student);
			}
		} catch (SQLException e) {
			System.out.println("Find All Query not executed");
		}
		return list;
	}

}
