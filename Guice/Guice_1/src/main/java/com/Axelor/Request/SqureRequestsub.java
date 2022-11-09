package com.Axelor.Request;

import com.Axelor.Guice_1.DrawShap;
import com.google.inject.Inject;

public class SqureRequestsub extends SqureRequest{

	@Inject
	public SqureRequestsub(DrawShap d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeRequest() {
      System.out.println("call in sub class");
		d.draw();
	}

}
