package com.example.samplespringboot.login;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
@AllArgsConstructor

public class signupService {
    public boolean createUser(HttpServletRequest request) throws Exception{
        SignupRepository signupRepository = new SignupRepository();
        boolean createUser = signupRepository.loginRepo(request);
        return createUser;
    }

}
