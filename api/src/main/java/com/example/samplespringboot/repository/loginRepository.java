package com.example.samplespringboot.repository;

import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.example.samplespringboot.repository.loginRepository;

@Repository
public class loginRepository {
    public boolean loginRepo(HttpServletRequest request) throws Exception {
        String value = request.getParameter("userInfo");
        String[] userInfomation = value.split("/");
        String url = "jdbc:h2:~/test";
        String user = "sa";
        String password = "";
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();
        String sqlNameSentence
                = "INSERT INTO USERS (NAME, PASSWORD) values ('"
                + userInfomation[0] + "','"
                + userInfomation[1] + "')";

        Boolean resultName = stmt.execute(sqlNameSentence);
        return resultName;
    }
}
