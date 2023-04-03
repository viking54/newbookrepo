package com.piyush.nagarro.Adv5_rest.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

	
	
	@Id
	@Column
	long code;
	@Column
	String name;
	@Column
	String author;
	@Column
	String date;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(long code, String name, String author, String date) {
		super();
		this.code = code;
		this.name = name;
		this.author = author;
		this.date = date;
	}
	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
}
