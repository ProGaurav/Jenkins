package com.example.sampleapplication.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Gaurav! From jenkins...";
    }
}
