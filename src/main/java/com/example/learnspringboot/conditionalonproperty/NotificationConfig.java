package com.example.learnspringboot.conditionalonproperty;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Frankie
 * @since 2022-08-02 8:41 AM
 */
@Configuration
public class NotificationConfig {

    @Bean(name = "emailNotification")
    @ConditionalOnProperty(prefix = "notification", name = "service", havingValue = "email")
    public NotificationSender sender1() {
        return new EmailNotification();
    }

    @Bean(name = "wechatNotification")
    @ConditionalOnProperty(prefix = "notification", name = "service", havingValue = "wechat")
    public NotificationSender sender2() {
        return new WechatNotification();
    }
}
