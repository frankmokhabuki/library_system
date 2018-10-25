package com.devills.library_system.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by moses.seloma on 2018-05-01.
 */

@Data
@NoArgsConstructor
@Document(collection = "user")
public class User {

    @Id
    private String id;
    private String name;
    private String surname;
    @Indexed(unique = true)
    private String email;
    private String cellNumber;
    public void updateProperties(User user) {
        this.name = user.name;
        this.surname = user.surname;
        this.cellNumber = user.cellNumber;
    }
}
