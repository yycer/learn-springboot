package com.example.learnspringboot.config;

import org.springframework.aop.interceptor.PerformanceMonitorInterceptor;
import org.springframework.aop.interceptor.SimpleAsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Frankie
 * @since 2022-01-16 1:49 PM
 */
@Import(value = {SimpleAsyncUncaughtExceptionHandler.class, PerformanceMonitorInterceptor.class})
@Configuration
public class ImportConfig {
}
