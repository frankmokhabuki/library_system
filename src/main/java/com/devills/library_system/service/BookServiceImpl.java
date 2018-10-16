package com.devills.library_system.service;

import com.devills.library_system.entity.Book;
import com.devills.library_system.exception.ResourceNotFoundException;
import com.devills.library_system.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public Book add(Book book) {
		return bookRepository.insert(book);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Book getBook(String isbn) {
		Book persistentBook = bookRepository.findByIsbn(isbn);
		if(persistentBook == null){
			throw new ResourceNotFoundException("Book not found!");
		}
		return persistentBook;
	}
}
