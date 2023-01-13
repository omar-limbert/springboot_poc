package com.springboot.poc.demo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Springboot Documentation", version = "2.0", description = "This is a POC"))
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
