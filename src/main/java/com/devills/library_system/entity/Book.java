package com.devills.library_system.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "books")
public class Book {
	
	@Id
	private String id;
	
	private String name;
	
	private String description;
	
	private String genre;
	
	private String author;

	@Indexed(unique = true)
	private String isbn;
	
	//a number that the library uses to identify a book
	@Transient
	private String uniqueBookIdentifier;
	
}
