package com.example.samplespringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
public class DbMapper {
    @Autowired
    @CrossOrigin
    @RequestMapping(method={RequestMethod.POST,RequestMethod.GET})
    public void getItem() throws Exception {
        System.out.println("test");
    }
}


//    public List<h2Domain> findAll(){
//        List<h2Domain> user = h2Service.findAll();
//        return user;
//    }
//        Resuection con = DriverManager.getConnection(url, user, password);
//        Statement stmt = con.createStatement();
//        ResultSet result = stmt.executeQuery("SELECT * from USER WHERE id = 2");
//    public static void getItems() throws Exception {
//        String url = "jdbc:h2:~/test";
//        String user = "sa";
//        String password = "";
//        Connection con = DriverManager.getConnection(url, user, password);
//        Statement stmt = con.createStatement();
//
//        while (result.next()) {
//            System.out.println(result.getString("id"));
//            System.out.println(result.getString("name"));
//            System.out.println(result.getString("password"));
//        }
//    }

