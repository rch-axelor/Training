package com.Axelor.getCon;

import com.Axelor.continent.GetContinent;
import com.Axelor.continentModular.ContinentModular;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Test {

	
	
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new ContinentModular());
		GetContinent continent = injector.getInstance(GetContinent.class);
		//System.out.println( continent);
		continent.get();
	}
}
