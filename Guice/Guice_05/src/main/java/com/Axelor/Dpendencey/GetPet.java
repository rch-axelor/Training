package com.Axelor.Dpendencey;

import com.Axelor.Demo.Animals;
import com.google.inject.Inject;
import com.google.inject.name.Named;

public class GetPet {

private	Animals animals ;


@Inject
public GetPet(@Named("DOG")Animals animals) {
	super();
	this.animals = animals;
}



public void getMypet()
{
	this.animals.animals();
}
}
