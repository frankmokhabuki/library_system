package com.devills.library_system.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by moses.seloma on 2018-05-01.
 */

@Getter
@Setter
@Document(collection = "users")
public class User {

    @Id
    private String id;
    private String name;
    private String surname;
    @Indexed(unique = true)
    private String email;
    private String cellNumber;
    @Transient
    private List<Book> borrowedBooks;

    public void updateProperties(User user) {
        this.name = user.name;
        this.surname = user.surname;
        this.cellNumber = user.cellNumber;
    }
}
