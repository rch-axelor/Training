package com.Axelor.onetooneuni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class Test {

	public static void main(String[] args) {
		
		PanCard card=new PanCard();
		card.setLocation("INDIA");
		card.setPannumber("118446495d46");
		
		PanCard card1=new PanCard();
		card1.setLocation("INDIA");
		card1.setPannumber("118446kjwbj3");
		
		PanCard card2=new PanCard();
		card2.setLocation("INDIA");
		card2.setPannumber("11844649kjwbjv4");
		
		PanCard card3=new PanCard();
		card3.setLocation("INDIA");
		card3.setPannumber("1184464999");
		
		Persion persion = new Persion();
		persion.setCard(card);
		persion.setEmail("abc@gmali.com");
		persion.setName("aaaaa");
		
		Persion persion1 = new Persion();
		persion1.setCard(card1);
		persion1.setEmail("abc@gmali.com");
		persion1.setName("aaaaa");
		
		Persion persion2 = new Persion();
		persion2.setCard(card2);
		persion2.setEmail("abc@gmali.com");
		persion2.setName("aaaaa");
		
		Persion persion3 = new Persion();
		persion3.setCard(card3);
		persion3.setEmail("abc@gmali.com");
		persion3.setName("aaaaa");
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jaga");
		EntityManager  entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		
		entityManager.persist(persion);
		entityManager.persist(persion1);
		entityManager.persist(persion2);
		entityManager.persist(persion3);
		entityTransaction.commit();
		
		
	}

}
