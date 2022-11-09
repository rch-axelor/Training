package com.Axelor.Gamesmodular;

import com.Axelor.Demo.Games;
import com.Axelor.Provider.Gameprovider;
import com.google.inject.AbstractModule;

public class GameModular extends AbstractModule{

	@Override
	protected void configure() {
		bind(Games.class).toProvider(Gameprovider.class);
		
	}
}
