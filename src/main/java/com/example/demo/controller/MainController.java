package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String index() {
        return "Hello, lovkonst!";
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return "Goodbye, lovkonst!";
    }
}
