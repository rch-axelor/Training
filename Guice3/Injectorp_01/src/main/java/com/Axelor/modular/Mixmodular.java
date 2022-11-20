package com.Axelor.modular;

import com.Axelor.Color.Color;
import com.Axelor.Color.Natural;
import com.Axelor.Color.Red;
import com.Axelor.Color.Rose;
import com.google.inject.AbstractModule;

public class Mixmodular extends AbstractModule{

	@Override
	protected void configure() {
		bind(Color.class).to(Red.class);
		bind(Natural.class).to(Rose.class);
	}
}
