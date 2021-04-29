package com.springboot.project;

import java.util.ArrayList;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BookService {

	@Autowired
	private Bookrepository bookrepository;
	
	//private static List<Book> list =new ArrayList<>();
	
//	static
//	{
//		list.add(new Book(12,"java complete refrence","xyz"));
//		list.add(new Book(13,"java first java","ABC"));
//		list.add(new Book(14,"Thing in java","LMN"));
//	}
	
	public List<Book> getAllBooks()
	{
		List<Book>list= (List<Book>)this.bookrepository.findAll();
	   
		return list;
	}
	
	public Book getBookById(int id)
	{
		Book book=null;
		try
		{
			//book=list.stream().filter(e->e.getId()==id).findFirst().get();
			book=this.bookrepository.findById(id);
		}
		catch (Exception e) {
		 e.printStackTrace();
		}
		
		return book;
		
	}
	
	//adding book
	public Book addBooks(Book b)
	{
		
	// list.add(b);	
	Book result=	bookrepository.save(b);
	 return result;
	}
}
