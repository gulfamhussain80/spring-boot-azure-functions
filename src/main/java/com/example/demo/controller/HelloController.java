package com.example.demo.controller;

import com.example.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
@RequestMapping("")
public class HelloController {

    private final MessageService messageService;

    @Autowired
    public HelloController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping("/")
    public String sayHello(@RequestBody Optional<String> request) {
        final String message;
        if(request.isPresent()){
            message = messageService.getMessage(request.get());
        }else{
            message = messageService.getMessage("Default Message");
        }
        
        return message;
    }
}
