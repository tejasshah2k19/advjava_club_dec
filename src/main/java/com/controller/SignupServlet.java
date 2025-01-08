package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

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
		String bornYear = request.getParameter("bornYear");

//		age-> 34 -> String -> convert  
		// encrypt
		// plaintext -> enc
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(password);
		System.out.println(bornYear);
		// lib->

		//

		boolean isError = false;
		String error = "";
		String alphaRegex = "[a-zA-Z]+"; // +=> min:1, max:n

		// XXX@XXX.XXX

		String emailRegex = "[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]{2,4}$";
		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			error += "Please Enter FirstName<br>";
		} else if (firstName.matches(alphaRegex) == false) {

			isError = true;
			error += "Please Enter Valid FirstName<br>";
		}

		if (lastName == null || lastName.trim().length() == 0) {
			isError = true;
			error += "Please Enter LastName<br>";
		} else if (lastName.matches(alphaRegex) == false) {
			isError = true;
			error += "Please Enter valid LastName<br>";
		}

		if (email == null || email.trim().length() == 0) {
			isError = true;
			error += "Please Enter Email<br>";
		} else if (email.matches(emailRegex) == false) {
			isError = true;
			error += "Please Enter Valid Email<br>";
		}

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");

		if (isError == true) {

			out.print(error);
		} else {
			out.print("Signup successfully done");
		}
		out.print("</body></hmtl>");

	}
}
