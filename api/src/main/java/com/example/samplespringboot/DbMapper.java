package com.example.samplespringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.samplespringboot.service.h2Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@RestController
@RequestMapping("api/user")
public class DbMapper {
    @Autowired
    h2Service h2Service;

    @GetMapping
    public String getItem() throws Exception{
        String url = "jdbc:h2:~/test";
        String user = "sa";
        String password = "";

        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery("SELECT * FROM USER WHERE id = 2");

        while (result.next()){
            System.out.println(result.getString("name"));
            String name = result.getString("name");
            return name;
        }
        return url;
    }
}
//    public List<h2Domain> findAll(){
//        List<h2Domain> user = h2Service.findAll();
//        return user;
//    }
//        Resuection con = DriverManager.getConnection(url, user, password);
//        Statement stmt = con.createStatement();
//        ResultSet result = stmt.executeQuery("SELECT * from USER WHERE id = 2");
//    public static void getItems() throws Exception {
//        String url = "jdbc:h2:~/test";
//        String user = "sa";
//        String password = "";
//        Connection con = DriverManager.getConnection(url, user, password);
//        Statement stmt = con.createStatement();
//
//        while (result.next()) {
//            System.out.println(result.getString("id"));
//            System.out.println(result.getString("name"));
//            System.out.println(result.getString("password"));
//        }
//    }

