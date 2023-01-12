package com.springboot.poc.demo.core.controllers;

import com.springboot.poc.demo.core.entities.User;
import com.springboot.poc.demo.core.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/users")
    public List<User> getAllUsers() {
        return userService.getUserList();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/users/{userName}")
    public User getUserByName(@PathVariable String userName) {
        return userService.getUserByName(userName);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/users/{userName}")
    public void updateUser(@RequestBody User user, @PathVariable String userName) {
        userService.updateUserByName(userName, user);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/users/{userName}")
    public void deleteUser(@PathVariable String userName) {
        userService.deleteUserByName(userName);
    }
}
