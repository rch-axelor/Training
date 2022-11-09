package com.Axelor.GetGames;

import com.Axelor.Demo.Games;
import com.google.inject.Inject;

public class GetGame {

private	Games games;

   @Inject
   public GetGame(Games games) {

	this.games = games;
}

		public void getMyGame()
        {
        	this.games.game();
        }
}
