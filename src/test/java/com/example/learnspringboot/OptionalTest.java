package com.example.learnspringboot;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

/**
 * @author Frankie
 * @since 2022-03-03 10:03 PM
 */
@Log
public class OptionalTest {

    /**
     * orElse() v.s. orElseGet()
     */
    @Test
    public void test1() {
        // 1. instance is null
        Object instance = null;
        Object ans1 = Optional.ofNullable(instance).orElse(getDefaultValue());
        assertEquals("DEFAULT_VALUE", ans1);
        log.info("=================== 1 ===============================");
        Object ans2 = Optional.ofNullable(instance).orElseGet(this::getDefaultValue);
        assertEquals("DEFAULT_VALUE", ans2);

        log.info("=================== 2 ===============================");

        // 2. instance is not null.
        Object instance2 = "null";
        Object ans3 = Optional.of(instance2).orElse(getDefaultValue());
        assertEquals("null", ans3);
        log.info("=================== 3 ===============================");
        Object ans4 = Optional.ofNullable(instance2).orElseGet(this::getDefaultValue);
        assertEquals("null", ans4);
    }

    public String getDefaultValue() {
        log.info("Getting default value.");
        return "DEFAULT_VALUE";
    }
}
