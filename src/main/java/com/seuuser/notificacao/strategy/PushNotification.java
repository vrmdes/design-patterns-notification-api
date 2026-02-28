package com.seuuser.notificacao.strategy;

public class PushNotification implements NotificationStrategy {
    public void send(String message) {
        System.out.println("PUSH: " + message);
    }
}
