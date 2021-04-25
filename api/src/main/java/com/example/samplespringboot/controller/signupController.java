package com.example.samplespringboot.controller;

import com.example.samplespringboot.service.signupService;
import lombok.AllArgsConstructor;
import net.bytebuddy.utility.RandomString;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.UUID;


@RestController
@RequestMapping("api/signup")
@AllArgsConstructor
public class signupController extends HttpServlet {

    signupService signupService = new signupService();
    @CrossOrigin
    @RequestMapping(method={RequestMethod.POST,RequestMethod.GET})

    public boolean signup(HttpServletRequest request) throws Exception {

        boolean createUser = signupService.createUser(request);
        return createUser;
    }
}
