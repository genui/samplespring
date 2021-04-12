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
import java.sql.Statement;

@RestController
@RequestMapping("api/post")


public class PostMapping extends HttpServlet {
    @CrossOrigin
    @RequestMapping(method={RequestMethod.POST,RequestMethod.GET})

    public void postItem(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws Exception{
        String value = request.getParameter("name");
        String url = "jdbc:h2:~/test";
        String user = "sa";
        String password = "";
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();
        String sqlSentence = "UPDATE USER SET NAME = '" + value + "' where id = 3;";
        System.out.println(sqlSentence);
        Boolean result = stmt.execute(sqlSentence);
    }
}
