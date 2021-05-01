package com.example.samplespringboot.login;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.sql.ResultSet;


@Service
@AllArgsConstructor
public class loginService{
    public String loginFunction(HttpServletRequest request) throws Exception{
        ResultSet allUser = allUsersRepository.allUser(request);
        String value = request.getParameter("userInfo");
        String[] userInfomation = value.split("/");
        String userFind = findUser.alluserfind(allUser, userInfomation);
        return userFind;
    }
}
