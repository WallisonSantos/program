package com.virtual.program;

import com.virtual.program.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRepository extends JpaRepository<Person,Long>{
    
}