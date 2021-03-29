package com.example.samplespringboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.samplespringboot.service.h2Service;

@RestController
@CrossOrigin
@Controller
@RequestMapping("user")

public class PostTextController {
    // 「DBの内容を返す」メソッドと「DBに登録する」メソッドを追加したい
}
