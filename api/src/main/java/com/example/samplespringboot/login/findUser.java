package com.example.samplespringboot.login;

import lombok.AllArgsConstructor;

import java.sql.ResultSet;
import java.sql.SQLException;

@AllArgsConstructor
public class findUser {
    public static String alluserfind(ResultSet allUser, String[] userInfomation)
            throws SQLException {

        while (allUser.next()) {
            String getId = allUser.getString("id");
            if (userInfomation[0].equals(allUser.getString("name"))
                    && userInfomation[1].equals(allUser.getString("password"))
            ) {
                return getId;
            }
        }
        return null;
    }
}
