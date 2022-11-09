package com.Axelor.justintimeinjectableConstructor;


import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.ProvidedBy;
import com.google.inject.Provider;

@ProvidedBy (BookProvider.class)
interface Books
	{
		public void myBook();
	}
	
	
	class Novel implements Books
	{
		String name;
		Integer age;
 
		
		@Inject
		public Novel(String name, Integer age) {
			super();
			this.name = name;
			this.age = age;
		}



		@Override
		public void myBook() {
          System.out.println("my Book is winges of fire");
          System.out.println(name);
          System.out.println(age);
		}
		
	}
	
	
	class BookBinder extends AbstractModule
	{
		@Override
		protected void configure() {
			
		}
	}
	

	
	class BookProvider implements Provider<Books>
	{
		@Override
		public Books get() {			
			return new Novel("jagabandhu", 22);
		}
	}
	
	
	class GetBook
	{
		private Books books;
		
		
		@Inject
		public GetBook(Books books) {
			super();
			this.books = books;
		}



		public void getMyBook()
		{
			this.books.myBook();
		}
	}
	
	
	public class Type3 {

	public static void main(String[] args) {

		Injector injector = Guice.createInjector(new BookBinder());
		GetBook book = injector.getInstance(GetBook.class);
		book.getMyBook();
		
		
	}

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	