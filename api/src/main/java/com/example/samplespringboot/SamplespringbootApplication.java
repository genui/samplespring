package com.example.samplespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController


public class SamplespringbootApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SamplespringbootApplication.class, args);
    }
}

