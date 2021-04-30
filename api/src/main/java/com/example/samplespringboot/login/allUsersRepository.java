package com.example.samplespringboot.login;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class allUsersRepository {
    public static ResultSet allUser(HttpServletRequest request) throws Exception {
        String value = request.getParameter("userInfo");
        String[] userInfomation = value.split("/");
        String url = "jdbc:h2:~/test";
        String user = "sa";
        String password = "";
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();
        String sqlNameSentence
                = "SELECT *FROM USERS";

        ResultSet resultName = stmt.executeQuery(sqlNameSentence);
        return resultName;
    }
}
