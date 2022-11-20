package com.Axelor.Run;


import com.Axelor.Getriver.GetRiver;
import com.Axelor.River.Ganga;
import com.Axelor.River.River;
import com.Axelor.Rivermodule.Rivermodule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Test {

	public static void main(String[] args) {

	 Injector injector = Guice.createInjector(new Rivermodule());
	 
//	 Ganga ganga = new Ganga("one");
	// ganga.setNo("one");
	 
//	 River river= ganga;
	 
	// injector.injectMembers(river);
	 
	 injector.getInstance(GetRiver.class).getname();
	 
	}

}
