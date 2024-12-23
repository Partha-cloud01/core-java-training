package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExample4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// step-1: Loading Driver by using Class.forName
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// step-2: Making Connection with Database
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com", "training", "Celcom123");

		// step-3: Creating Statement
		String sql = "select * from partha_employee1 ";
		PreparedStatement ps = con.prepareStatement(sql);
		
		//Executing the Query
		ResultSet rs = ps.executeQuery(); // Method to display the data in database with return type resultset.
		
		while(rs.next()) {
		System.out.println(rs.getInt("eid") + " " + rs.getString("ename") + " " + rs.getInt("esalary") +" "+rs.getInt("did"));
		}
		rs.close();
		ps.close();
		con.close();
	}

}
