package com.example.demo.controllers;

import com.example.demo.Services.ChatService;

import com.example.demo.controllers.api.ChatsApi;
import com.example.demo.dto.ChatDto;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
public class ChatsController implements ChatsApi {

@Autowired
private ChatService chatService;

    @Override
    public ChatDto save(ChatDto chatDto) {
        return chatDto;
    }

    @Override
    public String findById(@PathVariable Integer id) {
        return "Vous avez trouvé le chat " + id;
    }

}

