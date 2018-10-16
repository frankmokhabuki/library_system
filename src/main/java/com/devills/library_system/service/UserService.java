package com.devills.library_system.service;

import com.devills.library_system.entity.User;

import java.util.List;

/**
 * Created by moses.seloma on 2018-05-01.
 */
public interface UserService {
    User addUser(User user);

    User updateUser(User user);

    User getUser(String email);

    List<User> getAllUsers();
}
