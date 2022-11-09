package com.Axelor.Depandencey;

import com.Axelor.Guice_3.Bike;
import com.google.inject.Inject;

public class MyBike {

	private Bike bike;
	
	@Inject
	public MyBike(Bike bike) {
		super();
		this.bike = bike;
	}

	public void getMybike()
	{
		bike.myBike();
	}
}
