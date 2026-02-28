package com.seuuser.notificacao.factory;

import com.seuuser.notificacao.strategy.*;

public class NotificationFactory {
    public static NotificationStrategy create(String type) {
        return switch (type.toLowerCase()) {
            case "email" -> new EmailNotification();
            case "sms" -> new SmsNotification();
            case "push" -> new PushNotification();
            default -> throw new IllegalArgumentException("Tipo inválido");
        };
    }
}
