package com.sces.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.sces.model.Course;
import com.sces.util.DBUtil;

public class CourseRepoImplemnts implements CourseRepo {

	public boolean doInsertCourse(Course course) {
		boolean flag = false;
		try {

			Connection con = DBUtil.getConnection();
			String sql = "insert into partha_course values(?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, course.getCourse_Id());
			ps.setString(2, course.getCourse_Name());
			ps.setString(3, course.getInstructor());

			int n = ps.executeUpdate();
			if (n == 1)

				flag = true;
		} catch (SQLException e) {
			System.out.println("Insert Query not executed");
		}
		return flag;
	}

	public boolean doDeleteCourse(int id) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getConnection();
			String sql = "delete partha_course where course_id = (?)";
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

	public boolean doUpdateCourse(Course course) {
		boolean flag = false;
		try {

			Connection con = DBUtil.getConnection();
			String sql = "update partha_course set course_name = ?, instructor = ? where course_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, course.getCourse_Name());
			ps.setString(2, course.getInstructor());
			ps.setInt(3, course.getCourse_Id());

			int n = ps.executeUpdate();
			if (n == 1)

				flag = true;
		} catch (SQLException e) {
			System.out.println("Update Query not executed");
		}
		return flag;
	}

	public Course doFindCourse(int id) {
		Course course = null;

		try {
			Connection con = DBUtil.getConnection();
			String sql = "select * from partha_course where course_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				course = new Course();
				course.setCourse_Id(rs.getInt("course_id"));
				course.setCourse_Name(rs.getString("course_name"));
				course.setInstructor(rs.getString("instructor"));

			}
		} catch (SQLException e) {
			System.out.println("Find Query not executed");
		}
		return course;
	}

	public List<Course> doFindAllCourse() {

		List<Course> list = new LinkedList<>();
		try {
			Connection con = DBUtil.getConnection();
			String sql = "select * from partha_course";
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Course course = new Course();
				course.setCourse_Id(rs.getInt("course_id"));
				course.setCourse_Name(rs.getString("course_name"));
				course.setInstructor(rs.getString("instructor"));

				list.add(course);
			}
		} catch (SQLException e) {
			System.out.println("Find All Query not executed");
		}
		return list;
	}

}
