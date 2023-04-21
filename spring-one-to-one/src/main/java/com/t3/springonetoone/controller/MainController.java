package com.t3.springonetoone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.t3.springonetoone.entity.Person;
import com.t3.springonetoone.entity.Pet;
import com.t3.springonetoone.repository.PersonRepository;

@Controller
public class MainController {

    @Autowired
    private PersonRepository personRepo;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/persons/new")
    public String createPerson(Model model) {
        Person person = new Person(); //Cria uma pessoa
        Pet pet = new Pet(); //Cria um pet
        person.setPetId(pet); //Vincula o pet a pessoa

        model.addAttribute("person", person);
        return "addEditPerson";
    }

}
