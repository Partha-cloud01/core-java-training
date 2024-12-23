package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// step-1: Loading Driver by using Class.forName
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// step-2: Making Connection with Database
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com", "training", "Celcom123");

		// step-3: Creating Statement
		String sql = "insert into partha_employee1 values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);

		// step-4:Executing the Query
		ps.setInt(1, 202);
		ps.setString(2, "Ajay");
		ps.setInt(3, 4800);
		ps.setInt(4, 200);

		int n = ps.executeUpdate(); // Method to insert, Delete, Update returns nothing

		if (n == 1)
			System.out.println("Employee Record Inserted");
		else
			System.out.println("Employee Record not Inserted");
		
		ps.close();
		con.close();
	}

}
