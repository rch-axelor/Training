package com.Axelor.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Axelor.Operaton.AllTeachers;
import com.Axelor.Teachers.Teacher;
import com.Axelor.intitializer.MyIntitializer;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.persist.jpa.JpaPersistModule;

public class MyServer extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String tid = req.getParameter("Tid");
		
		String tname = req.getParameter("Tname");
		
		String sub = req.getParameter("sub");
		
		String chars = req.getParameter("chars");
		
		System.out.println(chars);
		
		Teacher teacher = new Teacher() ;
		 
		teacher.setTid(Integer.parseInt(tid));
		teacher.setTname(tname);
		teacher.setSub(sub);
		
		Injector injector = Guice.createInjector(new JpaPersistModule("jaga"));
		MyIntitializer mi = injector.getInstance(MyIntitializer.class);
		AllTeachers allTeachers = injector.getInstance(AllTeachers.class);
		
		
		
		/*FOR INSERTING THE DATA IN TABLE*/
		if(sub != null && tname != null && tid != null && chars ==  null) {
	
		allTeachers.insert(teacher);
		
		PrintWriter out = resp.getWriter();
		
		out.println("teacher inSerted");
		}
		
		/*fOR UPDATE */
		if(sub == null && tname != null && chars ==  null)
		{
			allTeachers.updateName(Integer.parseInt(tid), tname);
		}
		
		if(sub == null && tname != null && chars ==  null)
		{
			allTeachers.updatesubject(Integer.parseInt(tid), sub);
		}
		
		if(sub == null && tname == null && chars ==  null) allTeachers.delete(Integer.parseInt(tid));
		
		
		if(sub == null && tname == null && tid == null && chars !=  null) {
			
		List<Teacher>list	=(List<Teacher>) allTeachers.read();
		
		System.out.println(list);
		
		PrintWriter out = resp.getWriter();
		
//		for(Teacher teacher2 : list)
//		{
////			out.println(teacher2);
////			out.println(teacher2.getTname());
////			out.println(teacher2.getSub());
//			System.out.println(teacher2);
//		}
		}
		
		
	}
}


















