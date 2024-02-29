package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    
    public String getMessage(String msg) {
        return "Here is your message: " + msg.toUpperCase();
    }
}
