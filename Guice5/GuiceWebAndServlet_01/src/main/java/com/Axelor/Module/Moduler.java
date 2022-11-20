package com.Axelor.Module;

import com.Axelor.servalat.GuiceServalateone;
import com.google.inject.servlet.ServletModule;

public class Moduler extends ServletModule {

	@Override
	protected void configureServlets() {
		
		serve("/kar").with(GuiceServalateone.class);
		super.configureServlets();
	}
}
