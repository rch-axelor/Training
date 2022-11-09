package com.Axelor.Guice_1;

import com.Axelor.Guice.anotation.ColorValu;
import com.Axelor.Guice.anotation.Sizevalu;
import com.google.inject.Inject;

public class DrawSqure implements DrawShap{

	private String color ;
	private Integer size;
	
	
	@Inject
	public DrawSqure(@ColorValu String color,@Sizevalu Integer size) {
		super();
		this.color = color;
		this.size = size;
	}



	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drowing squre with color:> "+ color+"with size:>"+size);
	}

}
