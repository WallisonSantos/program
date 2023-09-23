package com.virtual.program.controllers;

import java.util.List;
import lombok.AllArgsConstructor;
import com.virtual.program.entities.Person;
import com.virtual.program.repositories.PersonRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PersonController {
    
    PersonRepository repository;

    @GetMapping("/api/person/find")
    public List<Person> getAllPerson() {    
        return repository.findAll();
    }
 
    @GetMapping("/api/person/find/{id}")
    public Person getByPersonId(@PathVariable Long id) {
        return repository.findById(id).get();
    }
 
    @PostMapping("/api/person/save")
    public Person createPerson(@RequestBody Person person) {
        return repository.save(person);
    }
 
    @DeleteMapping("/api/person/delete/{id}")
    public boolean deletePersonById(@PathVariable Long id) {
        repository.deleteById(id);
        return true;
    }
}