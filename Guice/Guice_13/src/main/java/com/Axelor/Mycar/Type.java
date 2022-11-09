package com.Axelor.Mycar;

import com.Axelor.Car.Cars;
import com.google.inject.Inject;

public class Type {
private Cars cars;

@Inject
public Type(Cars cars) {
	super();
	this.cars = cars;
}

public void myCar()
{
	this.cars.type();
}
}
