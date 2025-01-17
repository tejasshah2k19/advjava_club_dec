package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculateAgeServlet")
public class CalculateAgeServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// year

		String birthYear = request.getParameter("birthYear");

		// validate
		boolean isError = false;
		String error = "";
		if (birthYear == null || birthYear.trim().length() == 0) {
			isError = true;
			error = "Please Enter Birth Year";
			request.setAttribute("birthYearError", "Please Enter Birth Year");
		}

		//
		
		//
		
		//
		if (isError) {
			// dispatch -> servlet -> html
			
			RequestDispatcher rd = request.getRequestDispatcher("InputAge.jsp");// set destination
			rd.forward(request, response);// go to destination
		} else {
			// go ahead
			response.setContentType("text/html");// html
			PrintWriter out = response.getWriter();
			out.print("<html><body>");
			out.print(birthYear);
			out.print("</body></html>");

		}

	}
}
