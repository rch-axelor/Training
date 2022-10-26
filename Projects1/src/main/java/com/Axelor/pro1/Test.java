package com.Axelor.pro1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		Student student =new Student();
		student.setDate_of_join("14/10/1999");
        student.setId(1);
        student.setName("jaga");
        
        System.out.println(student);
        
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pu");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
          entityTransaction.begin();
          entityManager.persist(student);
          entityTransaction.commit();

	}

}
