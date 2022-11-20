package com.Axelor;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 6940782737488657061L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("hello");
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int k = i + j;

		PrintWriter out = resp.getWriter();

		// request dis and redirect

    	req.setAttribute("k", k);

    	RequestDispatcher rd= req.getRequestDispatcher("sq");
    	rd.forward(req, resp);

//		out.println("result is----->" + k);
//		out.close();
//
//    	resp.sendRedirect("sq?k="+k);   //its url Rewriting
	}
}
