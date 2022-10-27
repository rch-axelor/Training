package com.Axellor.car;

import javax.annotation.Nonnull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	@Nonnull
    private String name;
	
    public Car(int id, String name, String brand) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
	}
	private String brand;
   
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", brand=" + brand + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
    
}
