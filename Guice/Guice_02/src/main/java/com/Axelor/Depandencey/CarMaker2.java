package com.Axelor.Depandencey;

import com.Axelor.Anotation.Audi;
import com.Axelor.Cars.Car;
import com.google.inject.Inject;

public class CarMaker2 extends CarMaker{

	@Inject
	public CarMaker2(@Audi Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}

}
