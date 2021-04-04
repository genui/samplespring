package com.example.samplespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.samplespringboot.DbMapper;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.example.samplespringboot.service.h2Service;

@SpringBootApplication
@RestController


public class SamplespringbootApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SamplespringbootApplication.class, args);
    }
}

