package com.bandomatteo.Prototipo_OpenAI.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    @GetMapping("/chat")
    public String model() {
        return "It works!";

    }
}
