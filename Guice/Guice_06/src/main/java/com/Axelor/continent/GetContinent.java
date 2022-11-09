package com.Axelor.continent;

import com.Axelor.Demo.Continent;
import com.google.inject.Inject;
import com.google.inject.name.Named;

public class GetContinent {


	private Continent continent;
	
	
	@Inject
	public GetContinent( @Named ("Asia") Continent continent) {
		super();
		this.continent = continent;
	}



	public void get()
	{
		this.continent.getContinent();
	}
}
