package com.example.webappcdd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello! Web Application Deployed using Jenkins + Docker 🚀";
    }
}