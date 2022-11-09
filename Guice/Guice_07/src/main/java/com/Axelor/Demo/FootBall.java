package com.Axelor.Demo;

import com.google.inject.Inject;

public class FootBall implements Games {

	
	private String name;
	private int age;
	
	@Inject
	public FootBall(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public void game() {
		System.out.println("my name is"+name+"and my age is "+age+" and i like FootBall");
		
	}

}
