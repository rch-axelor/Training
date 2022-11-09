package com.Axelor.BookModule;


import com.Axelor.constructorBinding.Book;
import com.Axelor.constructorBinding.ProductQuentity;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class BookModule extends AbstractModule {

	@Override
	protected void configure() {
		
		try{
       bind(ProductQuentity.class).toConstructor(Book.class.getConstructor(String.class));
		}catch (NoSuchMethodException | SecurityException e) {
			System.out.println("constructor not present");
		}
		bind(String.class).annotatedWith(Names.named("book")).toInstance("jaga");
	}
}
