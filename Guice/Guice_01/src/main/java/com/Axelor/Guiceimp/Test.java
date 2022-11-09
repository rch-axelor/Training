package com.Axelor.Guiceimp;

import com.Axelor.Dpendent.CarRequest;
import com.Axelor.Guice_01.Products;
import com.Axelor.Module.CarMoDule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Test {

	private static final String products = "Car";
	
	private static void SendProductRequest(String product) 
	{
		if(product.equals(products))
		{
			Injector injector = Guice.createInjector(new CarMoDule());
			Products  products = injector.getInstance(Products.class);
		//	Products  products = injector.getInstance(Car.class);
			CarRequest carRequest = new CarRequest(products);
			carRequest.makeCar();
		}
	}
	
	public static void main(String[] args) {
		
		Test.SendProductRequest("Car"); 
	}

}
