package com.Axelor.OneToOneBi;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Rider {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String rider_id;
	
	@OneToOne(cascade = CascadeType.ALL , targetEntity = Bike.class)
	private Bike bike;

	public Rider() {
		super();
	}

	public Rider(int id, String name, String rider_id, Bike bike) {
		super();
		this.id = id;
		this.name = name;
		this.rider_id = rider_id;
		this.bike = bike;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRider_id() {
		return rider_id;
	}

	public void setRider_id(String rider_id) {
		this.rider_id = rider_id;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	@Override
	public String toString() {
		return "Rider [id=" + id + ", name=" + name + ", rider_id=" + rider_id + ", bike=" + bike + "]";
	}

	
}
