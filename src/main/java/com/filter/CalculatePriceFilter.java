package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/CalculatePriceServlet")
public class CalculatePriceFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// req -> goAhead
		// error -> goBack

		String productName = request.getParameter("productName");
		String strPrice = request.getParameter("price");

		boolean isError = false;

		if (productName == null || productName.trim().length() == 0) {
			isError = true;
			request.setAttribute("productNameError", "Please Enter ProductName");
		}
		if (strPrice.isBlank()) {
			isError = true;
			request.setAttribute("priceError", "Please Enter Price");
		}

		if (isError) {
			request.getRequestDispatcher("InputProduct.jsp").forward(request, response);// go back
		} else {
			// go ahead ->
			// chain -> second filter -> other -> Servlet
			chain.doFilter(request, response);// next filter | servlet
		}

	}

	@Override
	public void destroy() {
	}
}

//init()
//service() 
//destroy()