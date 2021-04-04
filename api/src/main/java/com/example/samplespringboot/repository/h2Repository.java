package com.example.samplespringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.example.samplespringboot.domain.h2Domain;

@Repository
public interface h2Repository extends JpaRepository <h2Domain,Integer> {
//    static ResultSet h2access(String[] args) throws Exception {
//        String url = "jdbc:h2:~/test";
//        String user = "sa";
//        String password = "";
//        Connection con = DriverManager.getConnection(url, user, password);
//        Statement stmt = con.createStatement();
//        ResultSet result = stmt.executeQuery("SELECT * FROM USER WHERE id = 2");
//        return result;
//    }
}

