package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// step-1: Loading Driver by using Class.forName
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// step-2: Making Connection with Database
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com", "training", "Celcom123");

		// step-3: Creating Statement
		String sql = "insert into partha_employee1 values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);

		// step-4:Batch processing Executing the Query
		ps.setInt(1, 202);
		ps.setString(2, "Partha");
		ps.setInt(3, 5000);
		ps.setInt(4, 200);
		ps.addBatch();
		
		ps.setInt(1, 203);
		ps.setString(2, "Kishore");
		ps.setInt(3, 5200);
		ps.setInt(4, 100);
		ps.addBatch();
		
		ps.setInt(1, 204);
		ps.setString(2, "Naveen");
		ps.setInt(3, 4500);
		ps.setInt(4, 300);
		ps.addBatch();
		
		ps.executeBatch();

//		int n = ps.executeUpdate(); // Method to insert, Delete, Update returns nothing
//
//		if (n == 1)
//			System.out.println("Employee Record Inserted");
//		else
//			System.out.println("Employee Record not Inserted");
		
		ps.close();
		con.close();
	}

}
