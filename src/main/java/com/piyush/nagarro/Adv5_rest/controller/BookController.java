package com.piyush.nagarro.Adv5_rest.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.piyush.nagarro.Adv5_rest.model.Book;
import com.piyush.nagarro.Adv5_rest.services.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	 
	@GetMapping("/books")
	 public List<Book> getBooks()
	 {
		return this.bookService.getBooks(); 
	 }
	 
	
	
	 @PostMapping("/books")
	 public Book addBook(@RequestBody Book book)
	 {
		 return this.bookService.addBook(book);
	 }
	 
	 @PostMapping("/edited")
	 public Book updateBook(@RequestBody Book book)
	 {
		 return this.bookService.updateBook(book);
	 }
	 @PostMapping("/delete/{code}")
	 public ResponseEntity<HttpStatus> deleteBook(@PathVariable String code)
	 {
		 try {
		  this.bookService.deleteBook(Long.parseLong(code));
		  return new ResponseEntity<>(HttpStatus.OK);
	 } catch(Exception e)
		 {
		 return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		 }
	 }
	 
	 
}
