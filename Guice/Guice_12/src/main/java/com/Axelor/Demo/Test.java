package com.Axelor.Demo;

import java.util.Scanner;

import com.Axelor.BikeCC.Power;
import com.Axelor.Getpower.PowerPovider;
import com.google.inject.Guice;
import com.google.inject.Injector;

import Com.Axelor.BikeModule.BikeModular2;
import Com.Axelor.BikeModule.BikeModule;

public class Test {

	public static void main(String[] args) {

		Injector injector = Guice.createInjector(new BikeModule(),new BikeModular2());

		try (Scanner scn = new Scanner(System.in)) {

			Power p = new Power();

			for (int i = 0; i < 10; i++) {
				System.out.println("Enter the CC");
				p.setCc(scn.nextInt());
				injector.getInstance(PowerPovider.class).provider(p);
			}
		}
	}

}
