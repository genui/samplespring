package com.example.samplespringboot.textInput;

import com.example.samplespringboot.textGet.textGetRepository;

import javax.servlet.http.HttpServletRequest;
import java.sql.ResultSet;

public class TextInputService {
    public void textInput (HttpServletRequest request) throws Exception {
        String value = request.getParameter("textInfo");
        String[] textInfomation = value.split("/");

        TextInputRepository textInputRepository = new TextInputRepository();

        textInputRepository.textInput(textInfomation);
    }
}
