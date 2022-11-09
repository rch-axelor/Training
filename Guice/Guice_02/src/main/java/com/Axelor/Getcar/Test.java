package com.Axelor.Getcar;

import com.Axelor.Carmodular.Modular;
import com.Axelor.Depandencey.CarMaker;
import com.Axelor.Depandencey.CarMaker2;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Test {

	private static final String car ="Car";
	
	public static void getingCar(String car)
	{
		if(car.equalsIgnoreCase(car))
		{
			Injector injector = Guice.createInjector(new Modular());
			CarMaker carMaker = injector.getInstance(CarMaker2.class);
			carMaker.makeMyCar();
		}
	}
	
	public static void main(String[] args) {
                 
		getingCar("car");
		
	}

}
