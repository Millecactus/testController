package com.example.demo.Services.ServicesImpl;

import com.example.demo.Services.ChatService;
import com.example.demo.Services.ChienService;
import com.example.demo.dto.ChatDto;
import com.example.demo.dto.ChienDto;
import org.springframework.stereotype.Service;

@Service("ChienService")
public class ChienServiceImpl implements ChienService {
    @Override
    public String aboie() {
        return null;
    }

    @Override
    public ChienDto save(ChienDto chienDto) {
        return null;
    }

    @Override
    public ChienDto findbyId(Integer id) {
        return null;
    }
}
