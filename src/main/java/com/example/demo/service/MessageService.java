package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    
    public String getMessagess(String msg) {
        return "Here is your message new temp message tetsing: " + msg.toUpperCase();
    }
}
