package com.example.learnspringboot;

import com.example.learnspringboot.conditionalonproperty.EmailNotification;
import com.example.learnspringboot.conditionalonproperty.NotificationConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

/**
 * @author Frankie
 * @since 2022-08-02 8:45 AM
 */
@Slf4j
public class NotificationTest {

    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner();

    @Test
    public void testEmailNotification() {
        this.contextRunner.withPropertyValues("notification.service=email")
                .withUserConfiguration(NotificationConfig.class)
                .run(context -> {
                    EmailNotification notification = context.getBean(EmailNotification.class);
                    String ans = notification.send("Hello yyc");
                    log.info("ans = {}", ans);
                });
    }
}
