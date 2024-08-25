package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
	private static final String url="jdbc:mysql://localhost:3306/form";
	private static final String user="root";
private static final String password="hariom";
	
	public static Connection getConnection() throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		return DriverManager.getConnection(url,user,password);
		
	}
	
	

}
