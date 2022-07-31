package com.example.learnspringboot;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author Frankie
 * @since 2022-05-31 7:39 AM
 */
@Slf4j
public class ExceptionTest {

    @Test
    public void test1() {
        try {
            new Long("xx");
        } catch (NumberFormatException e) {
            // log.error("error=", e);
            throw e;
        }
    }
}
