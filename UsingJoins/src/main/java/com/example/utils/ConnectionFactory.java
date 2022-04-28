package com.example.utils;

import java.sql.*;
import java.util.ResourceBundle;

public class ConnectionFactory {

	
	
	public static Connection getOracleConnection() {
		
		Connection con=null;
		
		
		try {
			ResourceBundle lables = ResourceBundle.getBundle("application");

			con= DriverManager.getConnection(lables.getString("datasource.oracle.url"),
					lables.getString("datasource.oracle.username" ),
					lables.getString("datasource.oracle.password"));
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return con;
		
		
	}
	
}