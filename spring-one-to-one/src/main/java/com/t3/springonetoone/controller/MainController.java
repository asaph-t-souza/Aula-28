package com.t3.springonetoone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.t3.springonetoone.repository.PersonRepository;

@Controller
public class MainController {

    @Autowired
    private PersonRepository charRepo;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/characters/new")
    public String createCharacter(Model model) {

        return "addEditChar";
    }

}
