package com.example.learnspringboot.service;

import com.example.learnspringboot.entity.Order;
import com.example.learnspringboot.respository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Frankie
 * @since 2022-07-31 9:59 AM
 */
@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Transactional
    public void batchInsertOrders(List<Order> orders) {
        try {
            orderRepository.insertOrder(orders.get(0));
            // int i = 10 / 0;
            orderRepository.insertOrder(orders.get(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
