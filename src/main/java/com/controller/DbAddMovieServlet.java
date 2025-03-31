package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.DbConnection2;

@WebServlet("/DbAddMovieServlet")
public class DbAddMovieServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String movieName = request.getParameter("movieName");
		String category = request.getParameter("category");
		String rating = request.getParameter("rating");
		String year = request.getParameter("year");

		// validation

		try {
			// db connection
			// db insertion
			Connection con = DbConnection2.getConnecion();// return con
			// query run -> PreparedStatement
			PreparedStatement pstmt = con
					.prepareStatement("insert into movies (movieName,category,rating,year) values (?,?,?,?)");
			pstmt.setString(1, movieName);
			pstmt.setString(2, category);
			pstmt.setString(3, rating);
			pstmt.setString(4, year);
			// run
			int i = pstmt.executeUpdate(); // run db and return int {how many records are affected }
			System.out.println(i+" record inserted...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
