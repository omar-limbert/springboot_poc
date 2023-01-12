package com.springboot.poc.demo.core.controllers;

import com.springboot.poc.demo.core.entities.User;
import com.springboot.poc.demo.core.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> getAllUsers() {
        return userService.getUserList();
    }

    @RequestMapping("/users/{userName}")
    public User getUserByName(@PathVariable String userName) {
        return userService.getUserByName(userName);
    }
}
