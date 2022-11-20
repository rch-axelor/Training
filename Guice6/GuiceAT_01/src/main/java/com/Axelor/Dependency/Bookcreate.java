package com.Axelor.Dependency;

import javax.persistence.EntityManager;

import com.Axelor.jpaTest.Book;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.persist.Transactional;

@Singleton
public class Bookcreate {

	//private GiveBook book ;
	
	@Inject
	private EntityManager em;

//	@Inject
//	public Bookcreate(GiveBook book) {
//		this.book = book;
//	}
//	
//	
//	public void createBook()
//	{
//		em.persist(new Book());
//	}
//	
//	
//	public void getStart()
//	{
//		this.book.start();
//	}
	
//	@Transactional
//	  public void createNewPerson() {
//	    em.persist(new Book());
//	  }
	@Transactional
	public void get()
	{
		  	
	
		em.persist(new Book(4, "ddd", "ppp"));
	}
}








