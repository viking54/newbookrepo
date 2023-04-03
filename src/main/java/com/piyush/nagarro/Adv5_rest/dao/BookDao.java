package com.piyush.nagarro.Adv5_rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.piyush.nagarro.Adv5_rest.model.Book;

public interface BookDao extends JpaRepository<Book,Long>{



Book findByCode(long code);

	
	

}
