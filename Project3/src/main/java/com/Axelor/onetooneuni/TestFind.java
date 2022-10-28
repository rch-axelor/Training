package com.Axelor.onetooneuni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestFind {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jaga");
		EntityManager  entityManager=entityManagerFactory.createEntityManager();
		Persion persion4=entityManager.find(Persion.class, 28);
		System.out.println(persion4);
	}

}
