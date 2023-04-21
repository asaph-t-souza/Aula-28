package com.t3.springonetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.t3.springonetoone.entity.Pet;

public interface PetRepository extends JpaRepository<Pet, Long>{
    
}
