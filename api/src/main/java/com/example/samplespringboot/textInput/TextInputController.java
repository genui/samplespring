package com.example.samplespringboot.textInput;

import com.example.samplespringboot.textGet.textGetService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("api/inputtext")
@AllArgsConstructor

public class TextInputController {
    TextInputService textInputService = new TextInputService();
    @CrossOrigin
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})

    public void inputText(HttpServletRequest request) throws Exception {
        textInputService.textInput(request);
    }
}
