package com.devills.library_system.service;

import com.devills.library_system.entity.Book;
import com.devills.library_system.entity.BookCopy;
import com.devills.library_system.entity.dto.BookCopyCaptureRequest;
import com.devills.library_system.entity.dto.BorrowRequest;
import com.devills.library_system.exception.ResourceNotFoundException;
import com.devills.library_system.repository.BookCopyRepository;
import com.devills.library_system.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookCopyRepository bookCopyRepository;

    @Override
    public Book capture(Book book) {
        return bookRepository.insert(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBook(String isbn) {
        Book persistentBook = bookRepository.findByIsbn(isbn);
        if (persistentBook == null) throw new ResourceNotFoundException("Book not found!");
        return persistentBook;
    }

    @Override
    public BookCopy getCopy(String bookUniqueIdentifier) {
        return bookCopyRepository.findByUniqueBookIdentifier(bookUniqueIdentifier);
    }

    @Override
    public BookCopy addCopy(BookCopyCaptureRequest bookCopyCaptureRequest) {
        validateIsbnExists(bookCopyCaptureRequest.getIsbn());
        BookCopy bookCopy = new BookCopy(bookCopyCaptureRequest);
        return bookCopyRepository.insert(bookCopy);
    }


    @Override
    public List<BookCopy> getAllBookCopies() {
        return bookCopyRepository.findAll();
    }

    @Override
    public BookCopy borrowBook(BorrowRequest borrowRequest) {
        BookCopy persistentBookCopy = bookCopyRepository.findByUniqueBookIdentifier(borrowRequest.getBookUniqueIdentifier());
        if (persistentBookCopy == null) throw new ResourceNotFoundException("Book copy not found!");
        persistentBookCopy.setUserEmail(borrowRequest.getUserEmail());
        return bookCopyRepository.save(persistentBookCopy);
    }

    private void validateIsbnExists(String isbn) {
        if (bookRepository.findByIsbn(isbn) == null) throw new ResourceNotFoundException("Book not found!");
    }
}
