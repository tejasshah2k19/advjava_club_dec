package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BSignupServlet")
public class BSignupServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// request
		// process
		// response
		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		// process
		System.out.println(firstName);
		System.out.println(email);
		System.out.println(password);
		System.out.println("BSignupServlet....");

		// login page
		RequestDispatcher rd = request.getRequestDispatcher("BLogin.jsp");
		rd.forward(request, response);
		//

	}

}
