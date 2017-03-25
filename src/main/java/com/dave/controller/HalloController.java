package com.dave.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HalloController {

    @RequestMapping("/hallo")
    public String index() {
        return "Hallo from from Spring Boot!";
    }

}