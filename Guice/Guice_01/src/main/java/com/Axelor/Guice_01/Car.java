package com.Axelor.Guice_01;

public class Car  implements Products{
	
	/*
	 * @Inject public Car() { super(); // TODO Auto-generated constructor stub }
	 */

	@Override
	public void getproduct() {
		System.out.println("Its a car");
	}

}
