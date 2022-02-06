package com.example.learnspringboot.controller;

import com.example.learnspringboot.bean.User2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Frankie
 * @since 2022-02-05 3:26 PM
 *
 * 自定义converter，将String(name和weight以#号分隔，转换成Pet对象)
 */
@RestController
public class CustomConverterController {

    @GetMapping ("/converter")
    public String testCustomConverter(User2 user) {
        return user.toString();
    }
}
