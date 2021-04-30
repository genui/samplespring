package com.example.samplespringboot.textGet;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class textGetRepository {
    public ResultSet textGet(String[] text) throws Exception {

        String url = "jdbc:h2:~/test";
        String user = "sa";
        String password = "";

        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();

        String sqlTextGet
                = "SELECT * FROM TEXT WHERE KEYWORD = '"
                + text[0]
                + "';";

        ResultSet getText = stmt.executeQuery(sqlTextGet);
        return stmt.executeQuery(sqlTextGet);
    }
}
