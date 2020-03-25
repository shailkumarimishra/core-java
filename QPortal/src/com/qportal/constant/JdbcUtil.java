package com.qportal.constant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
static {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Exception occur while loading the Driver");
			
		}

	}
	public static Connection getMySQLConnection() throws SQLException{
		String url="jdbc:mysql://localhost:3307/quiz";
		Connection connection = DriverManager.getConnection(url, "root" ,"sh@il");
		return connection;
	}
	public static void cleanUp(Statement st,Connection con) {
		
			try {
				if(st!=null)
			     st.close();
				if(con!=null)
					con.close();
			
			}catch(SQLException sql) {
				System.out.println("Exception occur while cleaning the resources");
			}
	}
}
