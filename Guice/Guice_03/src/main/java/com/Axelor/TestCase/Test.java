package com.Axelor.TestCase;

import com.Axelor.Depandencey.MyBike;
import com.Axelor.Module.BikeModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Test {

	private final static String Bike = "bike";


	public static void getbike(String b) {
		Injector injector = Guice.createInjector(new BikeModule());
		if (Bike.equalsIgnoreCase(b)) {
			MyBike bike = injector.getInstance(MyBike.class);
			bike.getMybike();
		}
	}

	public static void main(String[] args) {
		getbike("bike");
	}
}
