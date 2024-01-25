package com.colak.springjpaonetomanytutorial.unidirectional.lazywithjoincolumn.repository;

import com.colak.springjpaonetomanytutorial.unidirectional.lazywithjoincolumn.jpa.Address1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Address1Repository extends JpaRepository<Address1, Long> {
}
