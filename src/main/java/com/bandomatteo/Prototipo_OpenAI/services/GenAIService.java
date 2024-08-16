package com.bandomatteo.Prototipo_OpenAI.services;

import com.bandomatteo.Prototipo_OpenAI.domain.DTOs.ChatRequestDTO;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface GenAIService {

    String getResponse(ChatRequestDTO chatRequestDTO);
}
