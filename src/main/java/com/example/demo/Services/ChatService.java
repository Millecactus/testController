package com.example.demo.Services;

import com.example.demo.dto.ChatDto;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Service;

@Service
public interface ChatService {

    ChatDto save(ChatDto chatDto);
    ChatDto findById(Integer id);
}
