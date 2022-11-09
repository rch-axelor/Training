package com.Axelor.Carmodule;

import com.Axelor.Annotation.CarsPermit;
import com.Axelor.Annotation.GetCar;
import com.Axelor.Car.Cars;
import com.Axelor.Car.Sedan;
import com.Axelor.Car.Suv;
import com.google.inject.AbstractModule;
import com.google.inject.Module;
import com.google.inject.Provides;

@GetCar
public class Moduleone extends AbstractModule {

	@Provides @CarsPermit
	 public int providcarno()
	{
		return 1;
		}
	
	@Override
	protected void configure() {
		bind(Cars.class).to(Sedan.class);
	}
	
}
