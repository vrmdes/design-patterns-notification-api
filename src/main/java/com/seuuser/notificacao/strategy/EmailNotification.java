package com.seuuser.notificacao.strategy;

public class EmailNotification implements NotificationStrategy {
    public void send(String message) {
        System.out.println("EMAIL: " + message);
    }
}
