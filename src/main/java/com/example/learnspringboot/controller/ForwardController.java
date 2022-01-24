package com.example.learnspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Frankie
 * @since 2022-01-24 8:39 AM
 */
@Controller
public class ForwardController {

    // Note: there is no @ResponseBody for this forwarded API.
    @GetMapping("/goto")
    public String testRequestAttribute(HttpServletRequest request) {
        request.setAttribute("name", "yyc2");
        return "forward:/goto/success2";
    }

    // 1. Get the attribute from the HttpServletRequest.
    @ResponseBody
    @GetMapping("/goto/success")
    public String testGotoSuccess1(HttpServletRequest request) {
        Map<String, String> map = new HashMap<>();
        map.put("name", (String) request.getAttribute("name"));
        return map.toString();
    }

    // 2. Get the attribute through the @RequestAttribute annotation.
    @ResponseBody
    @GetMapping("/goto/success2")
    public String testGotoSuccess2(@RequestAttribute("name") String name) {
        Map<String, String> map = new HashMap<>();
        map.put("name", name);
        return map.toString();
    }
}
