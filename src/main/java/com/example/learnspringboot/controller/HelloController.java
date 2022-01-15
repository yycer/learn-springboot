package com.example.learnspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Frankie
 * @since 2022-01-13 9:47 PM
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String home() {
        return "Hello World!";
    }
}
