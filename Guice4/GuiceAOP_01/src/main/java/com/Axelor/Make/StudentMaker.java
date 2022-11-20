package com.Axelor.Make;

import java.util.Scanner;

import com.Axelor.Notation.qualifier;
import com.Axelor.Stpudentinfo.Student;

public class StudentMaker {

	Student s;
	
	@qualifier
	public Student make()
	{
		this .s = new Student();
		Scanner sch = new Scanner(System.in);
		System.out.println("eanter the name");
		s.setName(sch.nextLine());
		
		System.out.println("eanter the parcentage");
		s.setPersent(sch.nextInt());
		
		return s;
	}
}
