package com.ebg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    //Rest endpoint to create APIs
    @GetMapping("/greet")
    public GreetResponse greet(){
        return new GreetResponse("Hello");
    }

    //We now have JSON as return up there
    record GreetResponse(String greet){

    }

}
