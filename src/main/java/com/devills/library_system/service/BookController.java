package com.devills.library_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devills.library_system.entity.Book;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/")
	public String saveBook() {
		Book book = new Book();
		bookService.save(book);
		return "saved";
	}
	
}
