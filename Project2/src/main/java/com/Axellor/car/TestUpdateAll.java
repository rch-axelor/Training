package com.Axellor.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestUpdateAll {

	public static void main(String[] args) {
		
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jaga");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	Car abc = (Car) entityManager.createQuery("select c from Car c where c.brand='TATA'").getSingleResult();
	
	System.out.println(abc);
	}
}
