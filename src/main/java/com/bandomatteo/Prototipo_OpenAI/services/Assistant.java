package com.bandomatteo.Prototipo_OpenAI.services;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.UserMessage;

public interface Assistant {

    String chat(@MemoryId Long memoryId, @UserMessage String userMessage);
}
