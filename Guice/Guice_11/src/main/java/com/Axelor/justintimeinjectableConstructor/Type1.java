package com.Axelor.justintimeinjectableConstructor;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

interface Student
{
	public void inClass();
}


class Std1 implements Student
{
     @Inject  @Named("one")
	private String s;

	public Std1() {	}
	
	@Override
	public void inClass() {
		System.out.println("its clas 1");
		System.out.println(s);
		
	}
}


class Studentmodules extends AbstractModule
{
	@Override
	protected void configure() {

		bind(Student.class).to(Std1.class);
		
		bind(String.class)
		.annotatedWith(Names.named("one")).
		   toInstance("jaga");
	}
}


class getStudent
{
	private Student student;

	@Inject
	public getStudent(Student student) {
	
		this.student = student;
	}
	
	public void getStudents()
	{
		student.inClass();
	}
	
}

public class Type1 {

	public static void main(String[] args) {
       
		Injector injector = Guice.createInjector(new Studentmodules());
		getStudent getStudent = injector.getInstance(getStudent.class);
		getStudent.getStudents();
	}

}
