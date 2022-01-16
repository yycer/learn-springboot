package com.example.learnspringboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Frankie
 * @since 2022-01-16 2:22 PM
 */
@Configuration
@ImportResource(locations = {"classpath:beans.xml"})
// @ImportResource(locations = {"beans.xml"})
public class ImportResourceConfig {
}
