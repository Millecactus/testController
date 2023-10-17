package com.example.demo.entity;

import jakarta.persistence.Entity;
import lombok.*;

@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Chien {

    private String nom;

    private Integer age;
}
