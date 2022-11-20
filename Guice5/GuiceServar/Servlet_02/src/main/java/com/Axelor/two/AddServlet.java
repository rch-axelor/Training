package com.Axelor.two;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{

//	 private static final long serialVersionUID = -3035403738691524615L;

	@Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	     {
	    	int i = Integer.parseInt( req.getParameter("num1"));
	    	int j = Integer.parseInt( req.getParameter("num2"));
	    	
	    	int k = i+j;
	    	
	    	req.setAttribute("k", k);
	    	
	    	RequestDispatcher rd = req.getRequestDispatcher("sq");
	    	
	    	rd.forward(req, resp);
	    	
	     }
}
