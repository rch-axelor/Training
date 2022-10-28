package com.Axelor.OneToOneBi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
 
	public static void main(String[] args) {
		
		Bike bike1=new Bike();
		bike1.setBike_number("od_01_5655");
		bike1.setName("AAAAAA");
		
		Bike bike2=new Bike();
		bike2.setName("BBBBBBB");
		bike2.setBike_number("od_02_4544");
		
		Bike bike3=new Bike();
		bike3.setBike_number("od_02_3433");
		bike3.setName("CCCCCC");
		
		Rider rider1=new Rider();
		rider1.setName("ROYAL ENFILD");
		rider1.setRider_id("OD-10101");
		
		Rider rider2=new Rider();
		rider2.setName("R15");
		rider2.setRider_id("OD-10101");
		
		Rider rider3=new Rider();
		rider3.setName("KTM");
		rider3.setRider_id("OD-10101");
		
		bike1.setRider(rider1);
		bike2.setRider(rider2);
		bike3.setRider(rider3);
		
		rider1.setBike(bike1);
		rider2.setBike(bike2);
		rider3.setBike(bike3);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jaga");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(bike1);
		entityManager.persist(bike2);
		entityManager.persist(bike3);
		entityTransaction.commit();
		
		
	}
}

