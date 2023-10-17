package com.example.demo.controllers.api;

import com.example.demo.dto.ChienDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import static com.example.demo.utils.Constants.APP_ROOT;

public interface ChienApi {

    @GetMapping (value = APP_ROOT + "/{name}/aboit")
    public String aboie(String name);

    @PostMapping (value = APP_ROOT + "/createChien" , produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ChienDto save (@RequestBody ChienDto chienDto);

    public  ChienDto findbyId(Integer id);
}
