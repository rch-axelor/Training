package com.Axelor.Checking;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.Axelor.Make.StudentMaker;
import com.Axelor.Stpudentinfo.Student;

public class Check implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		StudentMaker maker = new StudentMaker();
		Student student=maker.make();
		int p = student.getPersent();
		
		if(p< 40 || p > 100)
		{
			throw new IllegalStateException("Not Qualified");
		}
		
		return invocation.proceed();
	}

}
