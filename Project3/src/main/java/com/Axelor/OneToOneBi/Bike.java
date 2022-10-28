package com.Axelor.OneToOneBi;

import javax.annotation.processing.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bike {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String Bike_number;
	
	@OneToOne(cascade = CascadeType.ALL , targetEntity = Rider.class)
	private Rider rider;

	
	
	public Bike() {
		super();
	}

	
	
	public Bike(int id, String name, String bike_number, Rider rider) {
		super();
		this.id = id;
		this.name = name;
		Bike_number = bike_number;
		this.rider = rider;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBike_number() {
		return Bike_number;
	}

	public void setBike_number(String bike_number) {
		Bike_number = bike_number;
	}

	public Rider getRider() {
		return rider;
	}

	public void setRider(Rider rider) {
		this.rider = rider;
	}



	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", Bike_number=" + Bike_number + ", rider=" + rider + "]";
	}
	
	
}
