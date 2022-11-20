package com.Axelor.jpaTest;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	private int Bid;
	
	private String BookName;
	
	private String Aname;

	
	
	
	public Book(int bid, String bookName, String aname) {
		super();
		Bid = bid;
		BookName = bookName;
		Aname = aname;
	}

	public int getBid() {
		return Bid;
	}

	public void setBid(int bid) {
		Bid = bid;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public String getAname() {
		return Aname;
	}

	public void setAname(String aname) {
		Aname = aname;
	}

	@Override
	public String toString() {
		return "Book [Bid=" + Bid + ", BookName=" + BookName + ", Aname=" + Aname + "]";
	}
	
	
	
	
}
