package com.example.learnspringboot.config;

import com.example.learnspringboot.bean.Pet;
import com.example.learnspringboot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Frankie
 * @since 2022-01-15 3:36 PM
 * Test the name of bean, the default is the name of method, but we can specify it using name property of the Bean annotation.
 */
@Configuration(proxyBeanMethods = true)
public class MyConfig {

    @Bean
    public User createUser() {
        return new User("yyc", 25);
    }

    @Bean(name = "haisen")
    public Pet createPet() {
        return new Pet("haisen");
    }
}
