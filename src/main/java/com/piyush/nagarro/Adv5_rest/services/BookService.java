package com.piyush.nagarro.Adv5_rest.services;

import java.util.List;
import java.util.Optional;

import com.piyush.nagarro.Adv5_rest.model.Book;

public interface BookService{
 
	
	public List<Book> getBooks();



	public Book addBook(Book book);

	


	public void deleteBook(long code);



	



	public Book updateBook(Book book);



	



	


	
		

}
