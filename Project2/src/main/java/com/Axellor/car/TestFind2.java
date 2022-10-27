package com.Axellor.car;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestFind2 {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jaga");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// List list = new ArrayList();
		 ArrayList result = (ArrayList) entityManager.createNativeQuery("select name from Car where brand='TATA'").getResultList();
		 for(int i=0;i<result.size();i++)System.out.println(result.get(i));
		 
//		entityManager.
//		
//		abc.forEach(t -> System.out.println("id = "+t.getId()+" name = "+ t.getName()+ " brand =" + t.getBrand()));
		
//		abc.forEach(t -> System.out.println(t));
		
	//	System.out.println(abc.size());
		
	//	for(Car c :abc)System.out.println(c);
//		Query query = entityManager.createNativeQuery("select c.id,c.brand,c.name from Car as c");
//		List<String> resultLists = query.getResultList();
//		
//		resultLists.forEach(t -> System.out.println(t));
//		resultLists.forEach(t -> System.out.println(t));
//		for (Car s : resultLists) {
////			Car a =(Car) s ;
//		System.out.println(s.getName());
//	}
//		Car a = (Car) resultList;
//		for (Object s : resultList) {
//			System.out.println(s.toString());
//		}
//		List<Car> resultList = query.getResultList();
//		List<Car> resultList = (List<Car>) entityManager.createNativeQuery("select  from Car").getResultList();
//		resultList.forEach(t -> System.out.println(t));
		// System.err.println(result);

		// System.out.println(result.size());

		// for(int i=0;i<result.size();i++)System.out.println(result.get(i));
//		System.out.println(entityManager.createNativeQuery("select id from Car").getResultList());

	}

}
