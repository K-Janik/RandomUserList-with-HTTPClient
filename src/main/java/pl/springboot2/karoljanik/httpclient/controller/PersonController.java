package pl.springboot2.karoljanik.httpclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.springboot2.karoljanik.httpclient.model.PersonInfo;
import pl.springboot2.karoljanik.httpclient.service.PersonService;

import java.util.List;

@RestController
@RequestMapping("/person-info")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<PersonInfo> getAllPersons() {
        return personService.getAllPersons();
    }
    }
