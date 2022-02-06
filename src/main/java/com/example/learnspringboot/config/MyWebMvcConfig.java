package com.example.learnspringboot.config;

import com.example.learnspringboot.converter.StringToPet2Converter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Frankie
 * @since 2022-02-05 3:33 PM
 */
@Configuration
public class MyWebMvcConfig implements WebMvcConfigurer{

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToPet2Converter());
    }
}
