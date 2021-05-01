package com.example.samplespringboot.login;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("api/signup")
@AllArgsConstructor
public class signupController extends HttpServlet {

    signupService signupService = new signupService();
    @CrossOrigin
    @RequestMapping(method={RequestMethod.POST,RequestMethod.GET})

    public String signup(HttpServletRequest request) throws Exception {

        String createUser = signupService.createUser(request);
        return createUser;
    }
}
