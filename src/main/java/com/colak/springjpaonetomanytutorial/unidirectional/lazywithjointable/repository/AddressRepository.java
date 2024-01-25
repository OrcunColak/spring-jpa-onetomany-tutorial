package com.colak.springjpaonetomanytutorial.unidirectional.lazywithjointable.repository;

import com.colak.springjpaonetomanytutorial.unidirectional.lazywithjointable.jpa.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
