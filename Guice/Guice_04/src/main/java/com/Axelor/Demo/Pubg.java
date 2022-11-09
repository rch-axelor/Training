package com.Axelor.Demo;

import com.Axelor.RequiredNotation.Playe1;
import com.google.inject.Inject;

public class Pubg implements Game {

	private String name;
	private Integer age;
	
	@Inject
	public Pubg( @Playe1 String name,@Playe1 Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
 

	@Override
	public void myGame() {
		System.out.println("Name:-"+name+"Age:-"+age+"   likes the PUBG game");
		
	}

}
