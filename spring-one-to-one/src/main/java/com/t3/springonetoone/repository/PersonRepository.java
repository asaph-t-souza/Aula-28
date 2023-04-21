package com.t3.springonetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.t3.springonetoone.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
    
}
