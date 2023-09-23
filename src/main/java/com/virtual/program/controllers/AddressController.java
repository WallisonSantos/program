package com.virtual.program.controllers;

import java.util.List;
import lombok.AllArgsConstructor;
import com.virtual.program.entities.Address;
import com.virtual.program.repositories.AddressRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AddressController {
    
    AddressRepository repository;

    @GetMapping("/api/address/find")
    public List<Address> getAllAddresses() {
        return repository.findAll();
    }

    @GetMapping("/api/address/find/{id}")
    public Address getAddressById(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PostMapping("/api/address/save")
    public Address creatAddress(@RequestBody Address address) {
        return repository.save(address);
    }

    @DeleteMapping("/api/address/delete/{id}")
    public Address deleteAddressById(@PathVariable Long id) {
        repository.deleteById(id);
        return repository.findById(id).get();
    }
}