package com.Axelor.Module;

import com.Axelor.Guice.anotation.ColorValu;
import com.Axelor.Guice.anotation.Sizevalu;
import com.Axelor.Guice_1.DrawShap;
import com.Axelor.Guice_1.DrawSqure;
import com.Axelor.Request.SqureRequest;
import com.Axelor.Request.SqureRequestsub;
import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule{

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		bind(DrawShap.class).to(DrawSqure.class);
	//	bind(String.class).toInstance("red");
	//	bind(Integer.class).toInstance(25);
		bind(String.class).annotatedWith(ColorValu.class).toInstance("red");
		bind(Integer.class).annotatedWith(Sizevalu.class).toInstance(25);
	//	bind(SqureRequest.class).to(SqureRequestsub.class);
	}
}
