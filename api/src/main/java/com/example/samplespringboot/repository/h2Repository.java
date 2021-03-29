package com.example.samplespringboot.repository;

import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Repository
public class h2Repository {
    public static void h2access(String[] arg) throws Exception{
        // H2にデータを追加
        Class.forName("org.h2.Driver");
        String dburl = "jdbc:h2:~/test";

        String sql = "INSERT INTO USER(username,password) VALUES('repository','repositoryy')";
        Connection conn = DriverManager.getConnection(dburl,"sa","");
        conn.createStatement().executeUpdate(sql);
        conn.close();

    }
}
