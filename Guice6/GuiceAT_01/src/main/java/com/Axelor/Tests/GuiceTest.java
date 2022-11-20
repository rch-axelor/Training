package com.Axelor.Tests;


import com.Axelor.Dependency.Bookcreate;
import com.Axelor.Initializer.MyIntitializer;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.persist.jpa.JpaPersistModule;

public class GuiceTest {

	public static void main(String[] args) {
//		Injector injector = Guice.createInjector(new Mymodule());
	
//	  Bookcreate bc = injector.getInstance(Bookcreate.class);
//	  
//	  bc.get();
	
//		Bookcreate bc = injector.getInstance(Bookcreate.class);
//	    bc.getStart();

	
	
//		EntityManager em  = injector.getInstance(EntityManager.class);
//		
//		System.out.println(em);
		
		Injector injector = Guice.createInjector(new JpaPersistModule("jaga"));
		MyIntitializer mi = injector.getInstance(MyIntitializer.class);
		
		Bookcreate bc = injector.getInstance(Bookcreate.class);
		bc.get();

	}
}
