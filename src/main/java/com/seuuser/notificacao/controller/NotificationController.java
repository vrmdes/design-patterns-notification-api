package com.seuuser.notificacao.controller;

import com.seuuser.notificacao.chain.*;
import com.seuuser.notificacao.factory.NotificationFactory;
import com.seuuser.notificacao.strategy.NotificationStrategy;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notify")
public class NotificationController {

    @PostMapping
    public String notify(
            @RequestParam String type,
            @RequestParam String message,
            @RequestHeader String token
    ) {
        ValidationHandler chain = new TokenValidation();
        chain.setNext(new MessageValidation());
        chain.validate(token, message);

        NotificationStrategy strategy = NotificationFactory.create(type);
        strategy.send(message);

        return "Notificação enviada!";
    }
}
