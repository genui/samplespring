package com.example.samplespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


@SpringBootApplication
@RestController


public class SamplespringbootApplication {
    public static void main(String[] args) throws Exception{
        // H2にデータを追加
        Class.forName("org.h2.Driver");
        String dburl = "jdbc:h2:~/test";

        String sql = "INSERT INTO USER(username,password) VALUES('test2','testpass2')";
        Connection conn = DriverManager.getConnection(dburl,"sa","");
        conn.createStatement().executeUpdate(sql);
        conn.close();


        SpringApplication.run(SamplespringbootApplication.class, args);

    }
//    public static void main(String[] args) {
//        SpringApplication.run(SamplespringbootApplication.class, args);
//    }
}

