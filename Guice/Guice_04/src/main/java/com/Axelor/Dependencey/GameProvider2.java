package com.Axelor.Dependencey;

import com.Axelor.Demo.Game;
import com.Axelor.RequiredNotation.FREEFIRE;
import com.google.inject.Inject;

public class GameProvider2 extends GameProvide1 {

	@Inject
	public GameProvider2( @FREEFIRE Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}

}
