package com.dave.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HalloController {

    @RequestMapping("/")
    public String index() {
        return "Hello from from Spring Boot!";
    }

}