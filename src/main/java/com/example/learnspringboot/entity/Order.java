package com.example.learnspringboot.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Frankie
 * @since 2022-05-28 4:09 PM
 */
@Data
public class Order {
    private long id;
    private String productName;
    private int number;
    private LocalDateTime orderDate;
    private BigDecimal price;
    private String source;
}
