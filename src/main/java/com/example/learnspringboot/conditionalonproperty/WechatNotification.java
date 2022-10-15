package com.example.learnspringboot.conditionalonproperty;

/**
 * @author Frankie
 * @since 2022-08-02 8:40 AM
 */
public class WechatNotification implements NotificationSender {
    @Override
    public String send(String message) {
        return "Wechat Notification: " + message;
    }
}
