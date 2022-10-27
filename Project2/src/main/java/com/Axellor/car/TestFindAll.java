package com.Axellor.car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestFindAll {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jaga");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		List<Car> abc = (List<Car>) entityManager.createQuery("select c.id from Car c where c.brand='TATA'").getResultList();
		for(Car cars :abc)System.out.println(cars);
		//abc.forEach(t -> System.out.println("id = "+t.getId()+" name = "+ t.getName()+ " brand =" + t.getBrand()));

	}
}
