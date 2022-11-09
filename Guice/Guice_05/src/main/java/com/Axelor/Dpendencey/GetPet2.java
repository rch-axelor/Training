package com.Axelor.Dpendencey;

import com.Axelor.Demo.Animals;
import com.google.inject.Inject;
import com.google.inject.name.Named;

public class GetPet2 extends GetPet{

	@Inject
	public GetPet2(@Named("CAT")  Animals animals) {
		super(animals);
		// TODO Auto-generated constructor stub
	}

}
