package com.example.demo.controllers.api;

import com.example.demo.dto.ChatDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.example.demo.utils.Constants.APP_ROOT;

public interface ChatsApi {
    @RequestMapping(APP_ROOT + "/createChat")
    @PostMapping(value =APP_ROOT + "/createChat", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ChatDto save( @RequestBody ChatDto chatDto);

    @GetMapping(value =  APP_ROOT + "/find{id}")
   String findById(Integer id);

}
