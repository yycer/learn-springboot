package com.example.learnspringboot.bean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author Frankie
 * @since 2022-01-16 2:06 PM
 */
@Component
public class RedPackage {

    @Bean(name = "money200")
    public void money() {
        System.out.println("我有200块钱");
    }

    @Bean
    @ConditionalOnBean(name = {"money200"})
    public void sendRedPackage() {
        System.out.println("发了一个200块的红包");
    }
}
