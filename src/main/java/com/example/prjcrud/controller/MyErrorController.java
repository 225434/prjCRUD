package com.example.prjcrud.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // 处理错误
        return "An error occurred. Please check your request.";
    }
}
