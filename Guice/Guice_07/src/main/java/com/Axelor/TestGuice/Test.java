package com.Axelor.TestGuice;

import com.Axelor.Gamesmodular.GameModular;
import com.Axelor.GetGames.GetGame;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Test {

	public static void main(String[] args) {

		Injector injector = Guice.createInjector(new GameModular());
	
		GetGame game = injector.getInstance(GetGame.class);
		game.getMyGame();
	}

}
