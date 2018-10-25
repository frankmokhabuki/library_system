package com.devills.library_system.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "book")
public class Book {
	
	@Id
	private String id;
	
	private String name;
	
	private String description;
	
	private String genre;
	
	private String author;

	@Indexed(unique = true)
	private String isbn;
	

	
}
