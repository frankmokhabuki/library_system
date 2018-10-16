package com.devills.library_system.repository;

import com.devills.library_system.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by moses.seloma on 2018-05-01.
 */
public interface UserRepository extends MongoRepository<User,String> {

    User findByEmail(String email);
}
