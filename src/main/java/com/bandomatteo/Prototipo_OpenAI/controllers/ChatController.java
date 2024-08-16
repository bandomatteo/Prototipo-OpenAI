package com.bandomatteo.Prototipo_OpenAI.controllers;


import com.bandomatteo.Prototipo_OpenAI.domain.DTOs.ChatRequestDTO;
import com.bandomatteo.Prototipo_OpenAI.domain.DTOs.ChatResponseDTO;
import com.bandomatteo.Prototipo_OpenAI.services.GenAIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    private GenAIService genAIService;

    public ChatController(GenAIService genAIService) {
        this.genAIService = genAIService;
    }

    @GetMapping("/chat")
    public ChatResponseDTO chat(@RequestBody ChatRequestDTO chatRequestDTO) {
        return new ChatResponseDTO(genAIService.getResponse(chatRequestDTO));

    }
}
