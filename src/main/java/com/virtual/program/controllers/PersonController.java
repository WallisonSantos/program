package com.virtual.program.controllers;

import java.util.List;
import lombok.AllArgsConstructor;
import com.virtual.program.AppRepository;
import com.virtual.program.entities.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PersonController {
    
    AppRepository repository;

    @GetMapping("api/person/find")
    public List<Person> getAllPerson() {    
        return repository.findAll();
    }
    @PostMapping("api/person/save")
    public Person createPerson(@RequestBody Person person) {
        return repository.save(person);
    }
}
