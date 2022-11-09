package com.Axelor.Depandencey;

import com.Axelor.Anotation.BMW;
import com.Axelor.Cars.Car;
import com.google.inject.Inject;

public class CarMaker {

	private Car car;

	@Inject
	public CarMaker( @BMW Car car) {
		super();
		this.car = car;
	}
	
	public void makeMyCar()
	{
		this.car.carType();
	}
	
	
}
