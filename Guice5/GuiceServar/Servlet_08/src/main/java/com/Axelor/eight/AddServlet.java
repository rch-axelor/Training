package com.Axelor.eight;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends  HttpServlet {

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
     {
    	int i = Integer.parseInt( req.getParameter("num1"));
    	int j = Integer.parseInt( req.getParameter("num2"));
    	
    	int k = i+j;
    	
    	PrintWriter out = resp.getWriter();
    	
    	out.println("<html><body bgcolor='cyan'>");
    	out.println("Output :"+ k);
    	out.println("</body></html>");
    	
//    	Cookie cookie = new Cookie("k", k+"");
//    	resp.addCookie(cookie);
//    	
//    	resp.sendRedirect("sq");
     }
}
