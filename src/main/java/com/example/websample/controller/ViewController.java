package com.example.websample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ViewController {
    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }
}
