package com.devills.library_system.service;

import com.devills.library_system.entity.Book;

import java.util.List;

public interface BookService {

    Book add(Book book);

    List<Book> getAllBooks();

    Book getBook(String isbn);
}
