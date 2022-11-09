package com.Axelor.run;

import com.Axelor.Dpendencey.GetPet;
import com.Axelor.Dpendencey.GetPet2;
import com.Axelor.Moudle.Animalodule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Test {

	private final static String animal1 = "Dog";
	private final static String animal2 = "Cat";
	
	private static void myPet(String animal)
	{
		Injector injector = Guice.createInjector(new Animalodule());
		if(animal1.equalsIgnoreCase(animal))
		{
			GetPet getPet = injector.getInstance(GetPet.class);
			getPet.getMypet();
		}
		if(animal2.equalsIgnoreCase(animal))
		{
			GetPet getPet = injector.getInstance(GetPet2.class);
			getPet.getMypet();
		}
	}
	
	
	public static void main(String[] args) {
      
		myPet("cat");
	}

}
