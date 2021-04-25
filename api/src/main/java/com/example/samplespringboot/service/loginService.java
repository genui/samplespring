package com.example.samplespringboot.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.sql.ResultSet;

import com.example.samplespringboot.repository.allUsersRepository;

@Service
@AllArgsConstructor
public class loginService{
    public boolean loginFunction(HttpServletRequest request) throws Exception{
        ResultSet allUser = allUsersRepository.allUser(request);
        String value = request.getParameter("userInfo");
        String[] userInfomation = value.split("/");
        boolean userFind = findUser.alluserfind(allUser, userInfomation);
        return userFind;
    }
}
