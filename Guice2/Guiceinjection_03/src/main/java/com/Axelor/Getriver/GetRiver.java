package com.Axelor.Getriver;

import com.Axelor.River.River;
import com.google.inject.Inject;

public class GetRiver {

	private River river;

	public GetRiver() {
	}

	@Inject
	public GetRiver(River river) {
		super();
		System.out.println("hellow");
		this.river = river;
	}

	public void getname() {
		river.name();
	}

	@Override
	public String toString() {
		return "GetRiver [river=" + river + "]";
	}

}
