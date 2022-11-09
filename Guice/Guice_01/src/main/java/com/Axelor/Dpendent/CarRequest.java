package com.Axelor.Dpendent;

import com.Axelor.Guice_01.Products;

public class CarRequest {
	Products products;

	public CarRequest(Products products) {
		super();
		this.products = products;
	}

	public void makeCar() {
		products.getproduct();
	}
}
