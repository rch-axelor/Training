package com.Axelor.Provider;

import com.Axelor.Demo.Cricket;
import com.Axelor.Demo.Games;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class Gameprovider implements Provider<Games> {

//	private Games games;
	
//	
//	@Inject
//	public Gameprovider(Games games) {
//		super();
//		this.games = games;
//	}



	@Override
	public Cricket get() {
		
		return new Cricket("jaga", 22);
		
		
	}

}
