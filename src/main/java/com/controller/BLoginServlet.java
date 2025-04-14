package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/BLoginServlet")
public class BLoginServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		// logic
		String firstName = "rock";

		Cookie c = new Cookie("firstName", firstName);
		c.setMaxAge(60 * 60);// 1 hr
		response.addCookie(c);

		// how to get session from server
		HttpSession session = request.getSession(); // get the session of current request
		
		//set data into session 
		session.setAttribute("email", email);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("BHome.jsp");
		rd.forward(request, response);
	}
}
