package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BLoginServlet")
public class BLoginServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			//logic 
			
			RequestDispatcher rd = request.getRequestDispatcher("BHome.jsp");
			rd.forward(request, response);
	}
}
