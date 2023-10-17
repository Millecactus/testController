package com.example.demo.entity;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Chat {

    private  String nom;

    private Integer age;

    private Integer poids;
}
