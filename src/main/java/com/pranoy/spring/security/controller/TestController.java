package com.pranoy.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello() {
        return "Spring security rockzz!!!";
    }

    @GetMapping("/bye")
    public String bye() {
        return "bye bye!!!";
    }
}
