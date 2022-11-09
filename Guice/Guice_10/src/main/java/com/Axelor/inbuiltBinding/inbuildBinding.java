package com.Axelor.inbuiltBinding;

import java.util.logging.Logger;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

class Getlogg
{
	private Logger logger;

	@Inject
	public Getlogg(Logger logger) {
		super();
		this.logger = logger;
	}
	
	public void showlog()
	{
		logger.info("Good morning");
	}
}

class logmodule extends AbstractModule
{
	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		super.configure();
	}
}

public class inbuildBinding {
 
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new logmodule());
		Getlogg getlogg = injector.getInstance(Getlogg.class);
		getlogg.showlog();
	}
}
























