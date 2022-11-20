package com.Axelor.four;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {

	
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
     {
    	int i = Integer.parseInt( req.getParameter("num1"));
    	int j = Integer.parseInt( req.getParameter("num2"));
    	
    	int k = i+j;
    	
    	HttpSession session = req.getSession();
    	
    	session.setAttribute("k", k);
    	
    	resp.sendRedirect("sq");
     }
}
