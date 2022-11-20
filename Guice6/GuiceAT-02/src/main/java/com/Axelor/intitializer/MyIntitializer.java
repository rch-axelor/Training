package com.Axelor.intitializer;

import com.google.inject.Inject;
import com.google.inject.persist.PersistService;

public class MyIntitializer {

	@Inject
	MyIntitializer(PersistService service) {
	    service.start();
	  }
}
