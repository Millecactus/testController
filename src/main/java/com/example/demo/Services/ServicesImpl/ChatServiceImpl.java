package com.example.demo.Services.ServicesImpl;

import com.example.demo.Services.ChatService;
import com.example.demo.dto.ChatDto;
import org.springframework.stereotype.Service;

@Service("ChatService")
public class ChatServiceImpl implements ChatService {
    @Override
    public ChatDto save(ChatDto chatDto) {
        return null;
    }

    @Override
    public ChatDto findById(Integer id) {
        return null;
    }
}
