package com.Axellor.car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RemoveAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jaga");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		List<Car> abc = (List<Car>) entityManager.createQuery("select c from Car c ").getResultList();
		
		for(int i=0;i<abc.size();i++)
		{
			entityTransaction.begin();
			entityManager.remove(abc.get(i));
			entityTransaction.commit();
		}
	}

}
