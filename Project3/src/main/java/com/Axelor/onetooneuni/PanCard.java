package com.Axelor.onetooneuni;

import javax.annotation.Nonnull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PanCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	@Nonnull
	private String pannumber;
	
	
	
	public PanCard() {
		super();
	}
	
	public PanCard(String pannumber, String location) {
		super();
		this.pannumber = pannumber;
		this.location = location;
	}

	private String location;
	
	
	public String getPannumber() {
		return pannumber;
	}
	public void setPannumber(String pannumber) {
		this.pannumber = pannumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "PanCard [pid=" + pid + ", pannumber=" + pannumber + ", location=" + location + "]";
	}
	
	
}
