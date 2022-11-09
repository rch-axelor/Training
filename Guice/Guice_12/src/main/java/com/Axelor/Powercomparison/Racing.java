package com.Axelor.Powercomparison;

import com.Axelor.BikeCC.Power;
import com.Axelor.Multibinding.Bike;

public class Racing implements Bike {

	@Override
	public String compare(Power power) {
		if (power.getCc() > 150)
			return "its a racing bick";
		else return "not a racing bike";
	}

}
