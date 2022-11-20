package com.Axelor.Implementation;

import com.Axelor.Demo.StudentLog;
import com.Axelor.Stpudentinfo.Student;

public class StudentLog1 implements StudentLog{

	@Override
	public void attendance(Student s) {
		System.out.println(s.getName()+"and Percent is" + s.getPersent());
	}

}
