package com.example.samplespringboot.login;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("api/login")
@AllArgsConstructor
public class loginController extends HttpServlet {
    loginService loginService = new loginService();
    @CrossOrigin
    @RequestMapping(method={RequestMethod.POST,RequestMethod.GET})

    public boolean loginFunction(HttpServletRequest request) throws Exception {
        boolean checkUser = loginService.loginFunction(request);
        return checkUser;
    }
}

