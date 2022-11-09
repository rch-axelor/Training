package com.Axelor.Test;

import com.Axelor.Carmodule.ModuleTwo;
import com.Axelor.Carmodule.Moduleone;
import com.Axelor.Mycar.Type;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Test {

	public static void main(String[] args) {
      
		Injector injector = Guice.createInjector(new ModuleTwo());
		Type type = injector.getInstance(Type.class);
		type.myCar();
	}

}
