package com.Axelor.Demo;

import com.google.inject.Inject;

public class Europe implements Continent {

	
	private String name;
	private int age;
	
	public Europe(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public void getContinent() {
     System.out.println("its  Europe    "+ "my name is "+name+"  and my age is "+ age);		
	}

}
