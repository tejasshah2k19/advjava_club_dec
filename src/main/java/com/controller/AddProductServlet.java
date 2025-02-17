package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// data read : form
		System.out.println("Final Servlet");
		String productName = request.getParameter("productName");
		String price = request.getParameter("price");
		String qty = request.getParameter("qty");

		boolean isError = false;
		String error = "";
		if (productName == null || productName.isBlank()) {
			isError = true;
			error = "Please Enter ProductName";
		}

		if (price == null || price.isEmpty()) {
			isError = true;
			error = error + "<br>Please Enter Price";
		}

		if (qty == null || qty.isEmpty()) {
			isError = true;
			error = error + "<br>Please Enter Qty";
		}

		// check
		if (isError == true) {
			// error
			
			request.setAttribute("error", error);
			RequestDispatcher rd = request.getRequestDispatcher("AddProduct.jsp");
			rd.forward(request, response);//dispatch
			
		} else {
			// no error
			RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
			rd.forward(request, response);//dispatch
		}

	}
}
