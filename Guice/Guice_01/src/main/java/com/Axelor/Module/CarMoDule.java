package com.Axelor.Module;

import com.Axelor.Guice_01.Car;
import com.Axelor.Guice_01.Products;
import com.google.inject.AbstractModule;

public class CarMoDule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Products.class).to(Car.class);
	}
}
