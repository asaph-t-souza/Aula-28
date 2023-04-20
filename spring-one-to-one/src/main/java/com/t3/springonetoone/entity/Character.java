package com.t3.springonetoone.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // Define a classe como uma entidade
@Table(name="characters")
@Getter @Setter @NoArgsConstructor // Modo Preguiça
public class Character {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "character_level")
    private int characterLevel;

    @Column(name = "character_class")
    private String characterClass;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pet_id", referencedColumnName = "id")
    private Pet petId;
    
}
