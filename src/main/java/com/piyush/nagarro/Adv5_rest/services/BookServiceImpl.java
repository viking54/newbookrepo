package com.piyush.nagarro.Adv5_rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piyush.nagarro.Adv5_rest.dao.BookDao;
import com.piyush.nagarro.Adv5_rest.model.Book;


@Service
public class BookServiceImpl implements BookService {

	@Autowired 
	private BookDao bookDao;
	

	
	
	@Override
	public Book addBook(Book book)
	{
		if(bookDao.findByCode(book.getCode()) !=null)
		{
			return book;
		}
		bookDao.save(book);
		return book;
	}
	
	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return bookDao.findAll();
	}
	

	@Override
	public void deleteBook(long code)
	{
	   Book entity = bookDao.getOne(code);
	  bookDao.delete(entity);
	}


	@Override
	public Book updateBook(Book book) {
		long id=book.getCode();
		Optional<Book> bookd=bookDao.findById(id);
		Book updateBook= bookd.get();
		updateBook.setName(book.getName());
		updateBook.setAuthor(book.getAuthor());
		bookDao.save(updateBook);
		return book;
	}




}
