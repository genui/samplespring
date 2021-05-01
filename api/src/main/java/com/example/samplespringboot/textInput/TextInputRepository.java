package com.example.samplespringboot.textInput;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TextInputRepository {
    public void textInput(String[] text) throws Exception {

        String url = "jdbc:h2:~/test";
        String user = "sa";
        String password = "";

        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();


        String sqlTextInput
                = "INSERT INTO TEXT VALUES ('"
                + text[0] + "','"
                + text[1] + "','"
                + text[2] + "'"
                + ");";

        stmt.execute(sqlTextInput);
    }
}
