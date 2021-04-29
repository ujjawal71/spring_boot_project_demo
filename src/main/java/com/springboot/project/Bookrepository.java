package com.springboot.project;

import org.springframework.data.repository.CrudRepository;

public interface Bookrepository extends CrudRepository<Book,Integer> {
	public Book findById(int id);

}
