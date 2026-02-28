package com.seuuser.notificacao.chain;

public class TokenValidation extends ValidationHandler {
    public void validate(String token, String message) {
        if (!"123".equals(token)) {
            throw new RuntimeException("Token inválido");
        }
        if (next != null) next.validate(token, message);
    }
}
