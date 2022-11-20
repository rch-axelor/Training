package com.Axelor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqureServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		
		int k = (int)req.getAttribute("k");
		
		k=k*k;
//		
//		int k = Integer.parseInt(req.getParameter("k"));
//		k=k*k;
//		out.println("resulat is ---->"+k);
//		
//		 int i = Integer.parseInt(req.getParameter("num1"));
//		 int j = Integer.parseInt(req.getParameter("num2"));
//		 
//		int k = 1;
//		
//		for(int n=0 ; n<j;n++) k*=i;
//		
		out.println("the result is ------------->"+ k);
		
		System.out.println("in sq server");
		
	}
}
