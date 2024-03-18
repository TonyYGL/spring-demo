package com.example.demo.controller;

import com.example.demo.vo.ResponseUtil;
import com.example.demo.vo.ResponseVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping
    public ResponseVo<String> test() {
        return ResponseUtil.getSuccess("operation success");
    }
}
