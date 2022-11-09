package com.Axelor.Powercomparison;

import com.Axelor.BikeCC.Power;
import com.Axelor.Multibinding.Bike;

public class Normal implements Bike {

	public String compare(Power power) {
		if ( power.getCc() <= 150)
			return "its an normal bick";
		else return "not a normal bike";
	}
}
