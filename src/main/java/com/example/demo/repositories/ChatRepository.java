package com.example.demo.repositories;

import com.example.demo.dto.ChatDto;

public interface ChatRepository {

    public ChatDto save(ChatDto chatDto);
}
