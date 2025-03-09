package com.company.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	private static final String url = "jdbc:postgresql://127.0.0.1:5432/logreg";
	private static final String username = "postgres";
	private static final String  password = "root";
	
	static {
		try {
			// load the driver
			Class.forName("org.postgresql.Driver");
		} catch ( ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException{
		System.out.println("connection build ho raha h...");
		return DriverManager.getConnection(url, username , password);
		
	}

}
