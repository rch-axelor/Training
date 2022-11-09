package com.Axelor.Moudle;


import com.Axelor.Demo.Animals;
import com.Axelor.Demo.Cat;
import com.Axelor.Demo.Dog;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class Animalodule extends AbstractModule {

	@Override
	protected void configure() {
       bind(Animals.class).annotatedWith(Names.named("DOG")).to(Dog.class);
       bind(Animals.class).annotatedWith(Names.named("CAT")).to(Cat.class);
	
	}
}
