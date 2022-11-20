package com.Axelor.River;

import com.google.inject.Inject;

public class Ganga implements River {

	private String no = null;

//	@Inject
	public Ganga() {
	}

	@Inject
	public Ganga(String n) {
		System.out.println("Hello"+n);
		this.no = n;
		System.out.println("Hello2"+no);
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	@Override
	public void name() {
		System.out.println("it is the Ganga River" + "  its number" + no + "hhhh");
	}

	public void orgin() {
		System.out.println("it is from Gangotri ");
	}

}
