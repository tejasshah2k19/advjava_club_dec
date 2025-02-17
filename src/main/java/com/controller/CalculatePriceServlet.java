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
		Integer price = Integer.parseInt(request.getParameter("price"));
		Integer discountPrice = Integer.parseInt(request.getParameter("discountPrice"));
		Integer tax = Integer.parseInt(request.getParameter("tax"));

		// print
		// System.out.println(productName);

		// validation ->

		// success -> logic

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
