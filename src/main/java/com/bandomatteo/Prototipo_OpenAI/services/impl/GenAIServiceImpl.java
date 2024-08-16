package com.bandomatteo.Prototipo_OpenAI.services.impl;

import com.bandomatteo.Prototipo_OpenAI.domain.DTOs.ChatRequestDTO;
import com.bandomatteo.Prototipo_OpenAI.services.Assistant;
import com.bandomatteo.Prototipo_OpenAI.services.GenAIService;
import dev.langchain4j.service.spring.AiService;



@AiService
public class GenAIServiceImpl implements GenAIService {

    private Assistant assistant;

    public GenAIServiceImpl(Assistant assistant) {
        this.assistant = assistant;
    }

    @Override
    public String getResponse(ChatRequestDTO chatRequestDTO) {

        return assistant.chat(chatRequestDTO.getId(), chatRequestDTO.getMessage());
    }
}
