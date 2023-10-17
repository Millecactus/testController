package com.example.demo.controllers.api;

import com.example.demo.Services.ChatService;
import com.example.demo.Services.ChienService;
import com.example.demo.dto.ChienDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ChienController implements  ChienApi{
@Autowired
private ChienService chienService;

    @Override
    public String aboie(@PathVariable String name) {
        return name + "fait woufwouf";
    }

    @Override
    public ChienDto save(ChienDto chienDto) {

        return chienDto;
    }

    @Override
    public ChienDto findbyId(Integer id) {
        return null;
    }
}
