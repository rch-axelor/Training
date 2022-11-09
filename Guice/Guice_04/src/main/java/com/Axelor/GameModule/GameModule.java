package com.Axelor.GameModule;


import com.Axelor.Demo.FreeFire;
import com.Axelor.Demo.Game;
import com.Axelor.Demo.Pubg;
import com.Axelor.RequiredNotation.FREEFIRE;
import com.Axelor.RequiredNotation.PUBG;
import com.Axelor.RequiredNotation.Playe1;
import com.Axelor.RequiredNotation.Player2;
import com.google.inject.AbstractModule;

public class GameModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Game.class).annotatedWith(PUBG.class).to(Pubg.class);
		
		bind(String.class).annotatedWith(Playe1.class).toInstance("jaga");
		bind(Integer.class).annotatedWith(Playe1.class).toInstance(22);
		
		bind(Game.class).annotatedWith(FREEFIRE.class).to(FreeFire.class);
		
		bind(String.class).annotatedWith(Player2.class).toInstance("DAS");
		bind(Integer.class).annotatedWith(Player2.class).toInstance(23);
	}
	
}
