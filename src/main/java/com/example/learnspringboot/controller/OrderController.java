package com.example.learnspringboot.controller;

import com.example.learnspringboot.entity.Order;
import com.example.learnspringboot.respository.OrderRepository;
import com.example.learnspringboot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Frankie
 * @since 2022-01-17 9:23 PM
 */
@RestController
public class OrderController {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    OrderService orderService;

    @GetMapping("/orders")
    public List<Order> getOrders() {
        return orderRepository.getAll();
    }

    @GetMapping("/orders/{id}")
    public Order getOrderById(@PathVariable("id") long orderId) {
        Order order = orderRepository.getOrderById(orderId);
        return order;
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

    @PostMapping("/orders/transaction")
    public String postOrders(@RequestBody List<Order> orders) {
        orderService.batchInsertOrders(orders);
        return "Success";
    }
}
