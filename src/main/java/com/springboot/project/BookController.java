package com.springboot.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/Books")
	public List<Book> getBooks()
	{
		
		return this.bookService.getAllBooks();
	}

	@GetMapping("/Books/{id}")
	public Book getBook(@PathVariable("id") int id)
	{
		
		return bookService.getBookById(id);
	}
	
	@PostMapping("/Books")
	public Book addBook(@RequestBody Book book)
	{
		Book b=this.bookService.addBooks(book);
		System.out.println(b);
		return b;
	}
	
	
	
	
}
