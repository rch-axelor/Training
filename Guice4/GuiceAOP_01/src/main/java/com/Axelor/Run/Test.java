package com.Axelor.Run;

import com.Axelor.Make.StudentMaker;
import com.Axelor.QualifierModule.CheckModule;
import com.Axelor.Storing.StudentStoring;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Test {

	public static void main(String[] args) {
	//S	Injector injector = Guice.createInjector(new CheckModule());
		StudentStoring storing = new StudentStoring();
		storing.setMaker(new StudentMaker());
		storing.getMaker().make();
	}
}
