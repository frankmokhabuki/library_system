package com.devills.library_system.controller;


import com.devills.library_system.entity.User;
import com.devills.library_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{email}")
    public User getUser(@PathVariable String email){
        return userService.getUser(email);
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @PostMapping("/update")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

}
