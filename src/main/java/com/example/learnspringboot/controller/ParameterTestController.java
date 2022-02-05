package com.example.learnspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Frankie
 * @since 2022-01-30 3:55 PM
 */
@RestController
public class ParameterTestController {

    @GetMapping("/test/param")
    public String test(@RequestParam("id") long id,
                       String name,
                       @RequestParam Map<String, String> requestParamMap) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("name", name);
        map.putAll(requestParamMap);
        return map.toString();
    }
}
