package com.example.samplespringboot.textGet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.sql.ResultSet;

public class textGetService {
    public String  textGet (HttpServletRequest request) throws Exception {
        String value = request.getParameter("textInfo");
        String[] textInfomation = value.split("/");
        textGetRepository textGetRepository = new textGetRepository();

        ResultSet getText = textGetRepository.textGet(textInfomation);
        while (getText.next()){
            String keyword = getText.getString("INPUTTEXT");
            return keyword;
        }
        return "KEYWORDが間違っています!";
    }
}
