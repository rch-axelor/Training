package com.Axelor.Demo;

import com.Axelor.RequiredNotation.Player2;
import com.google.inject.Inject;

public class FreeFire implements Game{
	
	private String name;
	private Integer age;
	
	@Inject
	public FreeFire( @Player2 String name, @Player2 Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public void myGame() {

		
		System.out.println("Name:-"+name+"Age:-"+age+"  likes the freefire game");
	}

}
