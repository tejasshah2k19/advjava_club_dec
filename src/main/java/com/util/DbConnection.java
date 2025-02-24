package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DbConnection {

	// java database connection -> open
	public static void main(String[] args) {
		// logic

		// connection ->
		// java -> sql db -> 4 property

		// 1) driver load
		// 2) db url
		// 3) username
		// 4) password

		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/advjava25";
		String userName = "root";
		String password = "root";

		try {

			// load driver
			Class.forName(driver);
			// db open
			Connection dbCon = DriverManager.getConnection(dbUrl, userName, password);

			// query-> PreparedStament
			PreparedStatement pstmt = dbCon.prepareStatement("insert into users (firstName,lastName) values (?,?)");
			pstmt.setString(1, "ram");
			pstmt.setString(2, "patel");
			pstmt.executeUpdate();// insert update delete

			System.out.println(dbCon);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
