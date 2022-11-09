package com.Axelor.Getpower;

import java.util.Set;

import com.Axelor.BikeCC.Power;
import com.Axelor.Multibinding.Bike;
import com.google.inject.Inject;

public class PowerPovider {

	private Set<Bike> bike;

	@Inject
	public PowerPovider(Set<Bike> bike) {
		super();
		this.bike = bike;
	}

	public void provider(Power power) {
		String s="";
	//	bike.forEach(t -> t.compare(power));
		for(Bike b :bike ) s+="\n"+b.compare(power);
		System.out.println(s);
	}

}
