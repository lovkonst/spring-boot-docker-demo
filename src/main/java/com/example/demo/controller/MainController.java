package com.example.demo.controller;

import com.example.demo.entity.AppUser;
import com.example.demo.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private AppUserRepository appUserRepository;

    @GetMapping("/")
    public String index() {
        return "Hello, lovkonst!";
    }

    @GetMapping("/users")
    public List<AppUser> users() {
        return appUserRepository.findAll();
    }
}
