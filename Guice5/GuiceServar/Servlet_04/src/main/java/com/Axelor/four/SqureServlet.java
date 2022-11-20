package com.Axelor.four;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqureServlet  extends HttpServlet

{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("in squre servar");
		
		HttpSession session = req.getSession();
		
		int k = (int) session.getAttribute("k");
		k=k*k;
		PrintWriter out = resp.getWriter();
		out.println("resulat is ---->"+k);
	}
}
