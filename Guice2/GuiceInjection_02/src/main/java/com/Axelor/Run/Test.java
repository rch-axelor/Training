package com.Axelor.Run;

import com.Axelor.BusModule.BusModule;
import com.Axelor.Busprovider.GetBus;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Test {
		
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new BusModule());
		GetBus bus = injector.getInstance(GetBus.class);
		bus.getBus();
	}
}
