package com.example.hmeressa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HMeressaApplication {
    public static void main(String[] args) {
        SpringApplication.run(HMeressaApplication.class, args);
    }

}


