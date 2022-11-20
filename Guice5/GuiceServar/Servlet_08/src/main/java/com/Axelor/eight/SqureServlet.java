package com.Axelor.eight;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sq")
public class SqureServlet extends  HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("in squre get");
		
	Cookie[] cookie	=req.getCookies();
	int k = 0;	
	
		for(Cookie c : cookie)
		{
			if(c.getName().equals("k")) k = Integer.parseInt(c.getValue());
		}
	
		k=k*k;
		PrintWriter out = resp.getWriter();
		out.println("resulat is ---->"+k);
	}
}
