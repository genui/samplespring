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
    public String loginRepo(HttpServletRequest request) throws Exception {
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
                = "INSERT INTO USERS values ('"
                + userInfomation[0] + "','"
                + userInfomation[1] + "','"
                + userInfomation[2] + "');";

        stmt.execute(sqlNameSentence);
        return randomKey;
    }
}
