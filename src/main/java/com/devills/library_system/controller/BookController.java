package com.devills.library_system.controller;

import com.devills.library_system.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.devills.library_system.entity.Book;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {
	
	@Autowired
	private BookService bookService;

	@GetMapping("/")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

	@GetMapping("/{isbn}")
	public Book getBook(@PathVariable String isbn) {
		return bookService.getBook(isbn);
	}

	@PostMapping("/add")
	public Book addBook(@RequestBody Book book) {
		return bookService.add(book);
	}


}
