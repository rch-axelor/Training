package com.Axelor.Module;

import com.Axelor.Guice_3.Bike;
import com.Axelor.Guice_3.RoyalEnfild;
import com.Axelor.Guice_3.RoyalEnfildBikeColour;
import com.google.inject.AbstractModule;

public class BikeModule extends AbstractModule {

	@Override
	protected void configure() {

		bind(Bike.class).to(RoyalEnfildBikeColour.class);
		bind(RoyalEnfild.class).to(RoyalEnfildBikeColour.class);
	}
}
