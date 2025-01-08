package com.controller;

import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InputServlet")
public class InputServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

		// read

		String a = request.getParameter("n1");
		String b = request.getParameter("n2");

		// validation
		// required

		boolean isError = false;
		String error = "";

		String digitRegex = "[0-9]+";// 1 n

		String digitRegex2 = "[0-9]{1,4}";// 1 n
		String digitRegex3 = "[0-9]{3}";// 1 n

		// digit -> isError
		// regex

		if (a == null || a.isBlank()) {
			isError = true;
			error = error + "Please Enter No 1.";
		} else if (a.matches(digitRegex) == false) {
			isError = true;
			error = error + "<br>Please Enter Valid No 1.";
		}

		if (b == null || b.isBlank()) {
			isError = true;

			error = error + "<br>Please Enter Valid No 2.";
		} else if (b.matches(digitRegex) == false) {
			isError = true;
			error = error + "<br>Please Enter No 2.";

		}

		if (isError == true) {
			// problem
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();// IO
			out.print("<html><body>");
			out.print("<B>" + error + "</b>");
			out.print("</body></html>");

		} else {
			// go ahead
			Integer n1 = Integer.parseInt(request.getParameter("n1"));// "" ->NumberformatException : ""
			Integer n2 = Integer.parseInt(request.getParameter("n2"));// "50"

			Integer ans = n1 + n2;

			System.out.println(ans);

			// 1)
			response.setContentType("text/html");
			// 2)
			PrintWriter out = response.getWriter();// IO

			// 3)
			out.print("<html><body>");
			out.print("<B>Ans = </b>" + ans);
			out.print("</body></html>");

		}

	}
}
