package com.Axelor.getgame;

import com.Axelor.Dependencey.GameProvide1;
import com.Axelor.Dependencey.GameProvider2;
import com.Axelor.GameModule.GameModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Test {

	private final static String game1="pubg";
	private static final String game2="freefire";
	
	
	public static void getGame(String game)
	{
		Injector injector = Guice.createInjector(new GameModule());
		if(game.equalsIgnoreCase(game1))
		{
			GameProvide1 gameProvide1 = injector.getInstance(GameProvide1.class);
			gameProvide1.gameType();
		}
		
		if(game.equalsIgnoreCase(game2))
		{
			GameProvider2 gameProvider2 =  injector.getInstance(GameProvider2.class);
			gameProvider2.gameType();
		}
		
	}
	
	
	public static void main(String[] args) {
		getGame("pubg");
		getGame("FReefire");
	}
}
