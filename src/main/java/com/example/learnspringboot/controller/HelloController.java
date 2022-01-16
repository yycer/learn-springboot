package com.example.learnspringboot.controller;

import com.example.learnspringboot.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Frankie
 * @since 2022-01-13 9:47 PM
 */
@Slf4j
@RestController
public class HelloController {

    @Autowired
    private Person person;

    @RequestMapping("/hello")
    public String home() {
        return "Hello World!";
    }

    @RequestMapping("/hello/person")
    public Person helloPerson() {
        log.info("UserName={}", person.getUserName());
        return person;
    }
}
