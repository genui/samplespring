package com.example.samplespringboot.login;

import org.springframework.jdbc.object.SqlQuery;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.UUID;

@Repository
public class SignupRepository {
    public boolean loginRepo(HttpServletRequest request) throws Exception {
        String value = request.getParameter("userInfo");
        String[] userInfomation = value.split("/");
        String url = "jdbc:h2:~/test";
        String user = "sa";
        String password = "";
        String randomKey = UUID.randomUUID().toString();
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();
        // ユーザのIDをランダムで生成
        String sqlNameSentence
                = "INSERT INTO USERS (ID, NAME, PASSWORD) values ('"
                + randomKey + "','"
                + userInfomation[0] + "','"
                + userInfomation[1] + "')";

        System.out.println(sqlNameSentence);
        return stmt.execute(sqlNameSentence);
    }
}
