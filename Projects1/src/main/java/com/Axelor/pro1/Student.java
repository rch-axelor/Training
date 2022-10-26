package com.Axelor.pro1;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	
	@Id
	private int id;
	private String name;
	private String date_of_join;
	
	
	
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
	
	public String getDate_of_join() {
		return date_of_join;
	}
	
	public void setDate_of_join(String date_of_join) {
		this.date_of_join = date_of_join;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", date_of_join=" + date_of_join + "]";
	}
	
	
}
