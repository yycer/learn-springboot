package com.example.learnspringboot.controller;

import com.example.learnspringboot.bean.MyProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Frankie
 * @since 2022-01-28 3:40 PM
 */
@RestController
public class ConfigurationPropertiesController {

    @Autowired
    private MyProperties myProperties;

    @GetMapping("/my/properties")
    public String getMyProperties() {
        // MyProperties(enables=true, remoteAddress=/192.168.1.1,
        // security=MyProperties.Security(username=admin, password=123, roles=[USER, ADMIN]))
        return myProperties.toString();
    }
}
