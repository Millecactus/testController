package com.example.demo.dto;

import com.example.demo.entity.Chien;
import lombok.*;

@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ChienDto {
    private String nom;

    private Integer age;

    public static ChienDto fromEntity(Chien chien){
        if(chien ==null){
            return  null; //TODO::throw an exception
        }

        return ChienDto.builder()
                .nom(chien.getNom())
                .age(chien.getAge())
                .build();
    }

    public static Chien toEntity(ChienDto chienDto){
        if(chienDto ==null){
            return  null; //TODO::throw an exception
        }

        return Chien.builder()
                .nom(chienDto.getNom())
                .age(chienDto.getAge())
                .build();
    }
}
