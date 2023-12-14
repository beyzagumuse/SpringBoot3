package com.ebg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication is used instead of @ComponentScan , @EnableAutoConfiguration, @Configuration
//@SpringBootApplication
@ComponentScan(basePackages = "com.ebg")
//I'm telling it the package it should look for components
@EnableAutoConfiguration
@Configuration
//If we have any bean inside that we want to instantiate, this works
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet")
    public String greet(){
        return "Hello";
    }

}
