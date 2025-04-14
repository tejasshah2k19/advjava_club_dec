package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogutServlet")
public class LogutServlet extends HttpServlet{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//session destroy 
		
		//current request -> get session 
		HttpSession session = request.getSession(); 

		//destroy 
		session.invalidate(); 
	
		//request dispatcher -> new 
		response.sendRedirect("BLogin.jsp");
		
	}

}
