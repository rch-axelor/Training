package com.Axelor.Dependencey;

import com.Axelor.Demo.Game;
import com.Axelor.RequiredNotation.PUBG;
import com.google.inject.Inject;

public class GameProvide1 {

	private Game game;
	
	
	@Inject
	public GameProvide1( @PUBG Game game) {
		super();
		this.game = game;
	}



	public void gameType()
	{
		this.game.myGame();
	}
}
