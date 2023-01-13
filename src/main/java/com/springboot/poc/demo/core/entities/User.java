package com.springboot.poc.demo.core.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private String name;
    private String age;
    private String gender;

    public User() {
    }

    public User(String name, String age, String gender) {
        super();
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

}
