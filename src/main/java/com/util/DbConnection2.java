package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection2 {

	// create database librarymgmt;

	// db connection open method
	public static Connection getConnecion() {

		String driverName = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/advjava25";
		String userName = "root";
		String password = "root";

		try {
			System.out.println(dbUrl);
			// 1
			Class.forName(driverName);// load driver

			// 2
			Connection connection = DriverManager.getConnection(dbUrl, userName, password);

			return connection;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
