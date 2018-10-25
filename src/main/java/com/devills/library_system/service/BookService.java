package com.devills.library_system.service;

import com.devills.library_system.entity.Book;
import com.devills.library_system.entity.BookCopy;
import com.devills.library_system.entity.dto.BookCopyCaptureRequest;
import com.devills.library_system.entity.dto.BorrowRequest;

import java.util.List;

public interface BookService {

    Book capture(Book book);

    List<Book> getAllBooks();

    Book getBook(String isbn);

    BookCopy getCopy(String bookUniqueIdentifier);

    BookCopy addCopy(BookCopyCaptureRequest bookCopyCaptureRequest);

    List<BookCopy> getAllBookCopies();

    BookCopy borrowBook(BorrowRequest borrowRequest);
}
