package com.example.samplespringboot;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@RestController
@RequestMapping("api/logintest")

public class login extends HttpServlet{
    @CrossOrigin
    @RequestMapping(method={RequestMethod.POST,RequestMethod.GET})

    public void loginFunction(HttpServletRequest request) throws Exception{
        String value = request.getParameter("userInfo");
        String[] userInfomation = value.split("/");
        System.out.println(userInfomation[0]);
        System.out.println(userInfomation[1]);
        String url = "jdbc:h2:~/test";
        String user = "sa";
        String password = "";
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();
        String sqlNameSentence
                = "INSERT INTO USERS (NAME, PASSWORD) values ('"
                + userInfomation[0] + "','"
                + userInfomation[1] + "')";

        Boolean resultName = stmt.execute(sqlNameSentence);
        System.out.println("Success!");
    }
}


