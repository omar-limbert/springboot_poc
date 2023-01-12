package com.springboot.poc.demo.core.services;

import com.springboot.poc.demo.core.entities.User;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Getter
    private final List<User> userList = List.of(
            new User("User 1", "18", "M"),
            new User("User 2", "28", "M"),
            new User("User 3", "38", "F"),
            new User("User 4", "48", "F"),
            new User("User 5", "48", "F"),
            new User("User 6", "48", "F"),
            new User("User 7", "48", "F"),
            new User("User 8", "48", "F")
    );

    public User getUserByName(String userName) {
        return userList.stream().filter(t -> t.getName().equalsIgnoreCase(userName)).findFirst().get();
    }
}
