package com.devills.library_system.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
public class Book {
	
	@Id
	private String id;
	
	private String name;
	
	private String description;
	
	private String genre;
	
	private String author;
	
	
	private String isbn;
	
	//a number that the library uses to identify a book 
	private String uniqueBookIdentifier;
	
}
