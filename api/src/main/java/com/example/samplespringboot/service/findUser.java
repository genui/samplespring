package com.example.samplespringboot.service;

import lombok.AllArgsConstructor;

import java.sql.ResultSet;
import java.sql.SQLException;

@AllArgsConstructor
public class findUser {
    public static boolean alluserfind(ResultSet allUser, String[] userInfomation)
            throws SQLException {

        while (allUser.next()) {
            if (userInfomation[0].equals(allUser.getString("name"))
                    && userInfomation[1].equals(allUser.getString("password"))
            ) {
                return true;
            }
        }
        return false;
    }
}
