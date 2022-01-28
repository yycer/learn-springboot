package com.example.learnspringboot.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Frankie
 * @since 2022-01-28 3:40 PM
 */
@Component
@ConfigurationProperties(prefix = "my.service")
@Data
public class MyProperties {
    private boolean enables;
    private InetAddress remoteAddress;
    private final Security security = new Security();

    @Data
    public static class Security {
        private String username;
        private String password;
        private List<String> roles = new ArrayList<>(Collections.singleton("USER"));
    }
}
