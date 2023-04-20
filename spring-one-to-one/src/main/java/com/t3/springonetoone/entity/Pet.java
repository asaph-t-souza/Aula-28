package com.t3.springonetoone.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // Define a classe como uma entidade
@Table(name = "pets")
@Getter @Setter @NoArgsConstructor // Modo Preguiça
public class Pet {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "race")
    private String race;

    @Column(name = "color")
    private String color;

    @Column(name = "pet_level")
    private String petLevel;
    
}
