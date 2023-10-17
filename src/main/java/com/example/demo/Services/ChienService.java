package com.example.demo.Services;

import com.example.demo.dto.ChienDto;
import com.example.demo.entity.Chien;
import org.springframework.stereotype.Service;

@Service
public interface ChienService {

    public String aboie();

    public ChienDto save (ChienDto chienDto);

    public  ChienDto findbyId(Integer id);


}
