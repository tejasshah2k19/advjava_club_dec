package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//annotation 
//@WebServlet("/CalculatePriceServlet")
public class CalculatePriceServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Final Servlet...");
		// request.getParameter()====> String

		String productName = request.getParameter("productName");
		String strPrice = request.getParameter("price");
		String strDiscountPrice = request.getParameter("discountPrice");
		String strTax = request.getParameter("tax");

		boolean isError = false;// no error

		if (productName == null || productName.trim().length() == 0) {
			isError = true;
			request.setAttribute("productNameError", "Please Enter ProductName");
		}

		if (strPrice == null || strPrice.trim().length() == 0) {
			isError = true;
			request.setAttribute("priceError", "Please Enter Product Price");
		}

		if (isError == true) {
			// send to InputProduct.jsp
			
			
			RequestDispatcher rd = request.getRequestDispatcher("InputProduct.jsp");
			rd.forward(request, response);// go ahead

		} else {

			Integer price = Integer.parseInt(strPrice);
			Integer discountPrice = Integer.parseInt(strDiscountPrice);
			Integer tax = Integer.parseInt(strTax);

			Integer grossPrice = (price - discountPrice);
			Float taxPrice = grossPrice * (tax / 100.0f);// 10 -> 0.10
			Float payable = grossPrice + taxPrice;

			// data next Bill.jsp
			request.setAttribute("productName", productName);
			request.setAttribute("price", price);
			request.setAttribute("discountPrice", discountPrice);
			request.setAttribute("tax", tax);
			request.setAttribute("taxPrice", taxPrice);
			request.setAttribute("payable", payable);

			// open Bill.jsp
			RequestDispatcher rd = request.getRequestDispatcher("Bill.jsp");
			rd.forward(request, response);// go ahead

		}

	}
}
