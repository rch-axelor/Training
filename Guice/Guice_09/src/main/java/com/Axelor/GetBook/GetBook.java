package com.Axelor.GetBook;

import com.Axelor.constructorBinding.Book;
import com.google.inject.Inject;

public class GetBook {

	private Book book;

	@Inject
	public GetBook( Book book) {
		super();
		this.book = book;
	}
	
	public void myBook()
	{
		this.book.getQuentity();
	}
}
