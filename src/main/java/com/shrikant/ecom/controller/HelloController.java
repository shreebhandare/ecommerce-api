package com.shrikant.ecom.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "This is main page!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "This is hello page!";
    }
}
