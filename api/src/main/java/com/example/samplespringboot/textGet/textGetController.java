package com.example.samplespringboot.textGet;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.sql.ResultSet;
import com.example.samplespringboot.textGet.textGetService;

@RestController
@RequestMapping("api/text")
@AllArgsConstructor

public class textGetController {

    textGetService textGetService = new textGetService();
    @CrossOrigin
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})

    public String getText(HttpServletRequest request) throws Exception {
        String text = textGetService.textGet(request);
        return text;
    }
}
