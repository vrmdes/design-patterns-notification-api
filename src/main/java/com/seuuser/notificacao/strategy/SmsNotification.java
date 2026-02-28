package com.seuuser.notificacao.strategy;

public class SmsNotification implements NotificationStrategy {
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}
