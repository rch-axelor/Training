package com.Axelor.Filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Test implements Filter  {
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)throws IOException, ServletException
	{
		String number = request.getParameter("jaga");
		int num = Integer.parseInt(number);
		
		PrintWriter out= response.getWriter();
		
		if(num%2==0)
		{
			chain.doFilter(request, response);
		       out.println("its an even numb");
		}
		else 
		{
			out.println("its an odd number");
		}
		
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		Filter.super.destroy();
	}

}
