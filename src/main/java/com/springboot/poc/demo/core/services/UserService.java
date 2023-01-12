package com.springboot.poc.demo.core.services;

import com.springboot.poc.demo.core.entities.User;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    @Getter
    private List<User> userList = new ArrayList<>(Arrays.asList(
            new User("User 1", "18", "M"),
            new User("User 2", "28", "M"),
            new User("User 3", "38", "F"),
            new User("User 4", "48", "F"),
            new User("User 5", "48", "F"),
            new User("User 6", "48", "F"),
            new User("User 7", "48", "F"),
            new User("User 8", "48", "F")
    ));

    public User getUserByName(String userName) {
        return userList.stream()
                .filter(t -> t.getName().equalsIgnoreCase(userName))
                .findFirst()
                .get();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void updateUserByName(String userName, User user) {
        for (int index = 0; index < userList.size(); index++) {
            User userToCheck = userList.get(index);
            if (userToCheck.getName().equalsIgnoreCase(userName)) {
                userList.set(index, user);
                break;
            }
        }
    }

    public void deleteUserByName(String userName) {
        userList.removeIf(user -> user.getName().equalsIgnoreCase(userName));
    }
}
