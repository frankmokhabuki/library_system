package com.devills.library_system.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.devills.library_system.entity.Book;

public interface BookRepository extends MongoRepository<Book, String> {

    Book findByIsbn(String isbn);
}
