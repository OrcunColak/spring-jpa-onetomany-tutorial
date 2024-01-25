package com.colak.springjpaonetomanytutorial.unidirectional.lazy.withjointable.repository;

import com.colak.springjpaonetomanytutorial.unidirectional.lazy.withjointable.jpa.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
