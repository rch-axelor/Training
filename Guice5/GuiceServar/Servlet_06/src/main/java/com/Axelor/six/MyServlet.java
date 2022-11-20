package com.Axelor.six;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 *  Servlet config & ServletContext
 * 
 * 
 * */



public class MyServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		PrintWriter out = resp.getWriter();
		
		out.println("hi<br");
		
		ServletContext ctx = getServletContext();
		
	String name =	ctx.getInitParameter("name");
	
	out.println(name);
	
	System.out.println("its workin");
	
	}
}
