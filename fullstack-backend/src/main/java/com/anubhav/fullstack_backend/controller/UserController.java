package com.anubhav.fullstack_backend.controller;

import com.anubhav.fullstack_backend.model.User;
import com.anubhav.fullstack_backend.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepo userRepo;
    @PostMapping("addUser")
    public User addUser(@RequestBody User newUser){
        return userRepo.save(newUser);
    }

    @GetMapping("users")
    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

}
