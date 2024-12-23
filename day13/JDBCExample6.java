package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample6 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// step-1: Loading Driver by using Class.forName
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// step-2: Making Connection with Database
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com", "training", "Celcom123");

		// step-3: Creating Statement
		String sql = "insert into partha_employee1 values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);

		// step-4:Executing the Query
		Object employee [][] = new Object[][]
			{
				{205,"Steven",3800,400},
				{206,"Praveen",5500,100},
				{207,"Sundar",5000,100},
				{208,"Gokul",5100,200}
			};
		for (int i = 0; i <employee.length; i++)
		{
			ps.setInt(1, (Integer)employee[i][0]);
			ps.setString(2, (String)employee[i][1]);
			ps.setInt(3, (Integer)employee[i][2]);
			ps.setInt(4, (Integer)employee[i][3]);
			ps.addBatch();
		}
		ps.executeBatch();
		//step-5: close
		ps.close();
		con.close();
	}

}
