package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class IMDBApp {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		int choice;
		while (true) {
			System.out.println("1 For Add Movie");// movieName , rating , category , year
			System.out.println("2 For List All Movies");
			System.out.println("3 For Search Movie");
			System.out.println("4 For Remove Movie");
			System.out.println("5 For Update Move");// rating , movie Name
			System.out.println("0 For Exit");
			System.out.println("Enter choice");

			choice = scr.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Movie Name, Rating , Category , Year :  ");
				
				String movieName  = scr.next(); 
				Float rating  = scr.nextFloat();
				String category = scr.next(); 
				Integer year = scr.nextInt(); 
				
				//db Connection 
				
				try {
					
					String driverName = "com.mysql.cj.jdbc.Driver";
					String dbUrl  = "jdbc:mysql://localhost:3306/advjava25";
					String userName = "root";
					String password = "root";
					
					Class.forName(driverName);
					
					Connection con = DriverManager.getConnection(dbUrl,userName,password);
					PreparedStatement pstmt = con.prepareStatement("insert into movies (movieName,category,rating,year) values (?,?,?,?)");
					pstmt.setString(1, movieName);
					pstmt.setString(2, category);
					pstmt.setFloat(3, rating);
					pstmt.setInt(4, year);

					pstmt.executeUpdate();
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				
				break;
			case 2:
				System.out.println("List Movie");
				break;
			case 3:
				System.out.println("SEARCH");
				break;
			case 4:
				System.out.println("REMOVE");
				break;
			case 5:
				System.out.println("UPDATE");
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("Invalid chocie PTA");
			}// switch
		} // while
	}// main
}// IMDBApp
