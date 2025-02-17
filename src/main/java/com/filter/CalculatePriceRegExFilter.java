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
public class CalculatePriceRegExFilter implements Filter {
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {


		System.out.println("Filter 2");
		
		String digitRegEx = "[0-9]+"; // 0-9 min:1 max:n

		// read
		String strPrice = request.getParameter("price");
		String strQty = request.getParameter("discountPrice");
		boolean isError = false;

		if (strPrice.matches(digitRegEx) == false) {
			isError = true;
			request.setAttribute("priceError", "Enter Valid Price");
		}

		if (strQty.matches(digitRegEx) == false) {
			isError = true;
			request.setAttribute("discountPriceError", "Enter Valid Disc. Price");
		}

		if (isError == true) {
			// goback
			request.getRequestDispatcher("InputProduct.jsp").forward(request, response);
		} else {
			// goahead
			chain.doFilter(request, response);// next Filter , servlet
		}

	}

	public void destroy() {
	}
}
