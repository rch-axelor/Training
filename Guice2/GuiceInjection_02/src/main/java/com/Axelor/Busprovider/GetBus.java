package com.Axelor.Busprovider;

import com.Axelor.Bus.Buss;
import com.google.inject.Inject;

public class GetBus {

	private Buss buss;
	
	
	@Inject
	public GetBus(Buss buss) {
		super();
		this.buss = buss;
	}



	public void getBus()
	{
		this.buss.busName();
	}
}
