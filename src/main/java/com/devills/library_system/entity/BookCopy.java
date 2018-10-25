package com.devills.library_system.entity;

import com.devills.library_system.entity.dto.BookCopyCaptureRequest;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@Document( collection = "book_copy" )
public class BookCopy {

    @Id
    private String id;

    @Indexed(unique = true)
    @NotNull(message = "Book copy unique identifier can't be null")
    private String uniqueBookIdentifier;

    @NotNull(message = "Book copy isbn can't be null")
    private String isbn;

    private String userEmail;

    public BookCopy(BookCopyCaptureRequest b) {
        this.uniqueBookIdentifier = b.getUniqueBookIdentifier();
        this.isbn = b.getIsbn();
    }
}
