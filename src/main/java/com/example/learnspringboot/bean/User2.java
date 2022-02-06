package com.example.learnspringboot.bean;

import lombok.Data;

/**
 * @author Frankie
 * @since 2022-02-05 3:27 PM
 */
@Data
public class User2 {
    private String name;
    private int age;
    private Pet2 pet;
}
