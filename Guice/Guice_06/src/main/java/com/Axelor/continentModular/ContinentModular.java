package com.Axelor.continentModular;

import com.Axelor.Demo.Asia;
import com.Axelor.Demo.Continent;
import com.Axelor.Demo.Europe;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

public class ContinentModular extends AbstractModule {

	@Override
	protected void configure() {

	
	}
	
	@Provides @Named("Asia")
	public Continent GiveAsia()
	{
		
		return new Asia("jaga",22);
	}
	
	@Provides @Named("Europe")
	public Continent GiveEurope()
	{
		Continent continent = new Europe("das",23);
		return continent;
	}
}
