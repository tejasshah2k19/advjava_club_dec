package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.DbConnection2;

@WebServlet("/DbListMovieServlet")
public class DbListMovieServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// get all movies from database
		// select * from movies;

		try {
			// db connection
			Connection con = DbConnection2.getConnecion();
			// preparestmt

			PreparedStatement pstmt = con.prepareStatement("select * from movies");

			ResultSet rs = pstmt.executeQuery();// cursor

			// executeUpdate(); --> insert update delete
			// executeQuery(); --> read --> select

			
			//rs -> send to jsp 
			request.setAttribute("rs", rs);
			
			RequestDispatcher rd = request.getRequestDispatcher("DbListMovie.jsp");
			rd.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		// run

	}
}
