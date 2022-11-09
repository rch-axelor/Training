package com.Axelor.Carmodule;

import com.Axelor.Car.Cars;
import com.Axelor.Car.SportCar;
import com.google.inject.AbstractModule;

public class ModuleTwo extends AbstractModule {

	@Override
	protected void configure() {
		bind(Cars.class).to(SportCar.class);
	}
}
