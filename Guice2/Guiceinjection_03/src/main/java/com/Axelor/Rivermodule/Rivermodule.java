package com.Axelor.Rivermodule;

import com.Axelor.River.Ganga;
import com.Axelor.River.River;
import com.google.inject.AbstractModule;

public class Rivermodule extends AbstractModule {

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		bind(River.class).to(Ganga.class);
	}
}
