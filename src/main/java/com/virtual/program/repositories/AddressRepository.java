package com.virtual.program.repositories;

import com.virtual.program.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long>{}