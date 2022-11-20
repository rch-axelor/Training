package com.Axelor.Run;

import com.Axelor.Givecolor.GetColor;
import com.Axelor.modular.Mixmodular;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Test {

	public static void main(String[] args) {

		Injector injector = Guice.createInjector(new Mixmodular());
		
		GetColor color = injector.getInstance(GetColor.class);
		
		System.out.println(color);
		
		color.getinfo();
		color.getoneinfo(1);
		
		GetColor color1 = injector.getInstance(GetColor.class);
		
		System.out.println(color1);
		GetColor color2 = injector.getInstance(GetColor.class);
		
		System.out.println(color2);
	}

}
