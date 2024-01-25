package com.colak.springjpaonetomanytutorial.bidirectional.lazy.withimplicitjoincolumn.repository;

import com.colak.springjpaonetomanytutorial.bidirectional.lazy.withimplicitjoincolumn.jpa.Student2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Student2Repository extends JpaRepository<Student2, Long> {
}
