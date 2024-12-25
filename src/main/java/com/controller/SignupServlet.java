package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("SignupServlet::service()");
		// request -> process ->
		// signup=> request -> process ->

		// read data
		// validation
		// database save

		// validation fail -> Signup
		// true -> Login

		// form->input->servlet->read?
		String firstName = request.getParameter("firstName");// String
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		int bornYear = Integer.parseInt(request.getParameter("bornYear"));
		String bornYear2 = request.getParameter("bornYear");

//		age-> 34 -> String -> convert  
		// encrypt
		// plaintext -> enc
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(password);
		System.out.println(bornYear);
		System.out.println(bornYear2);
		// lib->

		//

	}
}
