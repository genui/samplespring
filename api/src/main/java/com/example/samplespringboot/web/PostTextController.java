package com.example.samplespringboot.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posttext")
@CrossOrigin

public class PostTextController {
    // 「DBの内容を返す」メソッドと「DBに登録する」メソッドを追加したい
}
