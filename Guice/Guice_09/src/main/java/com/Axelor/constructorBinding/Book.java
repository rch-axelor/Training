package com.Axelor.constructorBinding;

import com.google.inject.name.Named;

public class Book implements ProductQuentity{
	private String name;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book( @Named("book")  String name) {
		this.name = name;
	}

	@Override
	public void getQuentity() {

		System.out.println("book name is "+name+" is 250 pic");
	}
}
