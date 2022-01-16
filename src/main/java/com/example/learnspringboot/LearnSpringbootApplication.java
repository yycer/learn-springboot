package com.example.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringbootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cxt = SpringApplication.run(LearnSpringbootApplication.class, args);
		// Arrays.stream(cxt.getBeanDefinitionNames()).forEach(System.out::println);
	}
}
