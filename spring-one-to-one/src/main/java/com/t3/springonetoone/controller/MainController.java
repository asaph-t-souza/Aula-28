package com.t3.springonetoone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.t3.springonetoone.entity.Person;
import com.t3.springonetoone.entity.Pet;
import com.t3.springonetoone.repository.PersonRepository;
import com.t3.springonetoone.repository.PetRepository;

@Controller
public class MainController {

    @Autowired
    private PersonRepository personRepo;

    @Autowired
    private PetRepository petRepo;

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

    @PostMapping("/persons/save")
    public String savePerson(Person person){
        personRepo.save(person); // Cascade.ALL salva ambas entidades
        return "redirect:/persons";
    }

    @GetMapping("/persons")
    public String getAllPersons(Model model){
        List<Person> persons = personRepo.findAll();
        model.addAttribute("persons", persons);
        return "PersonList";
    }

    @GetMapping("/pets")
    public String getAllPets(Model model){
        List<Pet> pets = petRepo.findAll();
        model.addAttribute("pets", pets);
        return "PetList";
    }

}
