package com.seuuser.notificacao.chain;

public class MessageValidation extends ValidationHandler {
    public void validate(String token, String message) {
        if (message == null || message.isBlank()) {
            throw new RuntimeException("Mensagem vazia");
        }
        if (next != null) next.validate(token, message);
    }
}
