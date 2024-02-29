package com.example.demo.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.service.MessageService;

import java.util.function.Function;

@Component
public class Hello implements Function<String, String> {

    private final MessageService messageService;

    @Autowired
    public Hello(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public String apply(String message) {
        return messageService.getMessage(message);
    }
}

