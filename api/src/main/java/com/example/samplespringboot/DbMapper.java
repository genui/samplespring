package com.example.samplespringboot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDateTime;
import java.util.List;

public class DbMapper {
    public static void dbAccess(String[] args) throws Exception{
        Class.forName("org.h2.Driver");
        String dburl = "jdbc:h2:~/test";

        String sql = "INSERT INTO USER(username,password) VALUES('testname1','testpassword1')";
        Connection conn = DriverManager.getConnection(dburl,"sa","");
        conn.createStatement().executeUpdate(sql);
        conn.close();
    }
}
