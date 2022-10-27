package com.Axellor.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
	Car car=new Car();

	car.setName("NANO");
	car.setBrand("TATA");
	
	Car car1=new Car();
	car1.setName("GHORKHA");
	car1.setBrand("MAHINDRA");
	
	Car car2=new Car();
	car2.setName("THAR");
	car2.setBrand("MAHINDRA");
	
	Car car3=new Car();
	car3.setName("X7");
	car3.setBrand("BMW");
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jaga");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	entityTransaction.begin();
	entityManager.persist(car);
	entityManager.persist(car1);
	entityManager.persist(car2);
	entityManager.persist(car3);
	entityTransaction.commit();
	

	}

}
