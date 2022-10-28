package com.Axelor.onetooneuni;

import javax.annotation.Nonnull;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Persion {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Nonnull
	private String name;
	private String email;
	@OneToOne(targetEntity =PanCard.class ,cascade=CascadeType.ALL)
	private PanCard card;
	
	
	public Persion() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Persion [id=" + id + ", name=" + name + ", email=" + email + ", card=" + card + "]";
	}


	public Persion(int id, String name, String email, PanCard card) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.card = card;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public PanCard getCard() {
		return card;
	}
	public void setCard(PanCard card) {
		this.card = card;
	}
	
	
}
