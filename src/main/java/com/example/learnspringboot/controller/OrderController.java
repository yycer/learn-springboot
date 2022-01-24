package com.example.learnspringboot.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author Frankie
 * @since 2022-01-17 9:23 PM
 */
@RestController
public class OrderController {

    @GetMapping("/order")
    public String getOrder() {
        return "Get Order";
    }

    @PostMapping("/order")
    public String postOrder() {
        return "Post Order";
    }

    @PutMapping("/order")
    public String putOrder() {
        return "Put Order";
    }

    @PatchMapping("/order")
    public String patchOrder() {
        return "Put Order";
    }

    @DeleteMapping("/order")
    public String deleteOrder() {
        return "Delete Order";
    }
}
