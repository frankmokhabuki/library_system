package com.devills.library_system.service;

import com.devills.library_system.entity.User;
import com.devills.library_system.exception.ResourceNotFoundException;
import com.devills.library_system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by moses.seloma on 2018-05-01.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.insert(user);
    }

    @Override
    public User updateUser(User user) {
        User persistentUser = getUser(user.getEmail());
        persistentUser.updateProperties(user);
        return userRepository.save(persistentUser);
    }

    @Override
    public User getUser(String email) {
        User persistentUser = userRepository.findByEmail(email);
        if(persistentUser == null){
            throw new ResourceNotFoundException("User not found!");
        }
        return persistentUser;
    }

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
