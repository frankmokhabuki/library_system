package com.devills.library_system.repository;

import com.devills.library_system.entity.BookCopy;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookCopyRepository extends MongoRepository<BookCopy,String> {
    BookCopy findByUniqueBookIdentifier(String bookUniqueIdentifier);
}
