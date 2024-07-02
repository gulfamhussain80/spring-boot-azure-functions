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

    private final MessageService messagessService;

    @Autowired
    public HelloController(MessageService messagessService) {
        this.messagessService = messagessService;
    }

    @PostMapping("/")
    public String sayHello(@RequestBody Optional<String> request) {
        final String message;
        if(request.isPresent()){
            message = messagessService.getMessagess(request.get());
        }else{
            message = messagessService.getMessagess("Default Message");
        }
        
        return message;
    }
}
