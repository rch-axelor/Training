package com.Axelor.Bus;

import com.google.inject.Inject;

public class BusOne implements Buss {

	final private Integer number = 123;
	private Integer BNO;

//	
//	@Inject
//	public BusOne() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//

	@Inject(optional = true)
	private void SetBno() {
		BNO = this.number;
	}

	@Override
	public void busName() {

		System.out.println("my bus name is aaa" + "its number is " + BNO);
	}

}
