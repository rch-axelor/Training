package com.Axelor.Carmodular;

import com.Axelor.Cars.Audi;
import com.Axelor.Cars.BMW;
import com.Axelor.Cars.Car;
import com.google.inject.AbstractModule;

public class Modular extends AbstractModule  {

	@Override
	protected void configure() {
		bind(Car.class).annotatedWith(com.Axelor.Anotation.BMW.class).to(BMW.class);
		bind(Car.class).annotatedWith(com.Axelor.Anotation.Audi.class).to(Audi.class);
	}
}
