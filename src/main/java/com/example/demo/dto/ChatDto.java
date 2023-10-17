package com.example.demo.dto;

import com.example.demo.entity.Chat;
import com.example.demo.repositories.ChatRepository;
import lombok.*;

@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ChatDto {
    private  String nom;
    private Integer age;
    private Integer poids;
   public static ChatDto fromEntity(Chat chat){

       if(chat==null){
           return null; //TODO: throw specific exception
       }

       return ChatDto.builder()
               .nom(chat.getNom())
               .age(chat.getAge())
               .poids(chat.getPoids())
               .build();
   }

    public static Chat toEntity(ChatDto chatDto){

        if(chatDto==null){
            return null; //TODO: throw specific exception
        }

        return Chat.builder()
                .nom(chatDto.getNom())
                .age(chatDto.getAge())
                .poids(chatDto.getPoids())
                .build();
    }



}



