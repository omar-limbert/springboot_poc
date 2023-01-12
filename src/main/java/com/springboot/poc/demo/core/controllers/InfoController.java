package com.springboot.poc.demo.core.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @RequestMapping("/info")
    public String sayHello(){
        return "The API its working!";
    }
}
